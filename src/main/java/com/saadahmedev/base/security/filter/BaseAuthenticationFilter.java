/*
 * Copyright 2018-2024 Saad Ahmed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.saadahmedev.base.security.filter;

import com.saadahmedev.base.exception.exception.UnauthorizedException;
import com.saadahmedev.base.security.service.BaseJwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;
import java.io.Serializable;

/**
 * BaseAuthenticationFilter is an abstract class that provides a foundation for implementing
 * JWT-based authentication filters in a Spring Security context. It extends Spring's
 * {@link org.springframework.web.filter.OncePerRequestFilter} to ensure that the filter is executed
 * once per request.
 *
 * @param <I> The type of the identifier stored in the JWT claims.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public abstract class BaseAuthenticationFilter<I extends Serializable> extends OncePerRequestFilter {

    private final UserDetailsService userDetailsService;
    private final BaseJwtService<I> baseJwtService;

    /**
     * Constructs a new BaseAuthenticationFilter with the provided UserDetailsService and BaseJwtService.
     *
     * @param userDetailsService The service to load user details.
     * @param baseJwtService     The service for handling JWTs.
     */
    protected BaseAuthenticationFilter(UserDetailsService userDetailsService, BaseJwtService<I> baseJwtService) {
        this.userDetailsService = userDetailsService;
        this.baseJwtService = baseJwtService;
    }

    /**
     * Performs the actual filtering logic for JWT-based authentication.
     *
     * @param request     The HttpServletRequest object.
     * @param response    The HttpServletResponse object.
     * @param filterChain The FilterChain for invoking the next filter in the chain.
     */
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) {
        String authorizationHeader = request.getHeader("Authorization");
        String username = null;
        String accessToken = null;

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ") && authorizationHeader.length() > 7) {
            accessToken = authorizationHeader.substring(7);

            try {
                username = baseJwtService.getUsername(accessToken);
            } catch (Exception e) {
                throw new UnauthorizedException("Valid JSON web token is missing.");
            }
        }

        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
            UserDetails userDetails = userDetailsService.loadUserByUsername(username);

            if (!baseJwtService.isTokenExpired(accessToken)) {
                UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(
                        userDetails.getUsername(),
                        userDetails.getPassword(),
                        userDetails.getAuthorities()
                );

                authToken.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            } else throw new UnauthorizedException("Token has been expired.");
        }

        doFilter(request, response, filterChain);
    }

    /**
     * Abstract method to be implemented by subclasses for custom filtering logic.
     *
     * @param request     The HttpServletRequest object.
     * @param response    The HttpServletResponse object.
     * @param filterChain The FilterChain for invoking the next filter in the chain.
     */
    abstract void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain);
}
