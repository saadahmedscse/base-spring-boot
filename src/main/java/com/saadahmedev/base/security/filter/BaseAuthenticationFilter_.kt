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

package com.saadahmedev.base.security.filter

import com.saadahmedev.base.exception.exception.UnauthorizedException
import com.saadahmedev.base.security.service.BaseJwtService_
import jakarta.servlet.FilterChain
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken
import org.springframework.security.core.context.SecurityContextHolder
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource
import org.springframework.web.filter.OncePerRequestFilter
import java.io.Serializable
import java.lang.Exception

abstract class BaseAuthenticationFilter_<I : Serializable>(
    private val userDetailsService: UserDetailsService,
    private val baseJwtService: BaseJwtService_<I>
) : OncePerRequestFilter() {

    override fun doFilterInternal(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    ) {
        val authorizationHeader = request.getHeader("Authorization")
        var username: String? = null
        var accessToken: String? = null

        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ") && authorizationHeader.length > 7) {
            accessToken = authorizationHeader.substring(7)

            try {
                username = baseJwtService.getUsername(accessToken)
            } catch (e: Exception) {
                throw UnauthorizedException("Valid JSON web token is missing")
            }
        }

        if (username != null && SecurityContextHolder.getContext().authentication == null) {
            val userDetails = userDetailsService.loadUserByUsername(username)

            if (!baseJwtService.isExpired(accessToken ?: "")) {
                val authToken = UsernamePasswordAuthenticationToken(
                    userDetails.username,
                    userDetails.password,
                    userDetails.authorities
                )

                authToken.details = WebAuthenticationDetailsSource().buildDetails(request)
            } else throw UnauthorizedException("Token has been expired")
        }

        doFilter(request, response, filterChain)
    }

    abstract fun doFilter(
        request: HttpServletRequest,
        response: HttpServletResponse,
        filterChain: FilterChain
    )
}