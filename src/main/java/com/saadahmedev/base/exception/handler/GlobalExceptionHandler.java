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

package com.saadahmedev.base.exception.handler;

import com.saadahmedev.base.exception.exception.ApiException;
import com.saadahmedev.base.exception.exception.BadRequestException;
import com.saadahmedev.base.exception.exception.UnauthorizedException;
import com.saadahmedev.base.response.ServerResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import jakarta.annotation.Nonnull;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global Exception Handler Class
 *
 * <p>
 * Provides centralized handling of exceptions across the application. Uses
 * Spring's {@link RestControllerAdvice} to handle specific exception types
 * and return appropriate {@link ResponseEntity} objects.
 * </p>
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles exceptions of type {@link ApiException}.
     *
     * @param exception The {@link ApiException} instance.
     * @return A {@link ResponseEntity} with internal server error response.
     */
    @ExceptionHandler(ApiException.class)
    public ResponseEntity<?> handleApiException(ApiException exception) {
        return ServerResponse.internalServerError(exception);
    }

    /**
     * Handles exceptions of type {@link BadRequestException}.
     *
     * @param exception The {@link BadRequestException} instance.
     * @return A {@link ResponseEntity} with bad request response.
     */
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> handleBadRequestException(@Nonnull BadRequestException exception) {
        return ServerResponse.badRequest(exception.getMessage());
    }

    /**
     * Handles exceptions of type {@link UnauthorizedException}.
     *
     * @param exception The {@link UnauthorizedException} instance.
     * @return A {@link ResponseEntity} with unauthorized response.
     */
    @ExceptionHandler(UnauthorizedException.class)
    public ResponseEntity<?> handleUnauthorizedException(@Nonnull UnauthorizedException exception) {
        return ServerResponse.unauthorized(exception.getMessage());
    }

    /**
     * Handles exceptions of type {@link HttpMessageNotReadableException}.
     *
     * @param exception The {@link HttpMessageNotReadableException} instance.
     * @return A {@link ResponseEntity} with bad request response.
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public ResponseEntity<?> handleMessageNotReadableException(@Nonnull HttpMessageNotReadableException exception) {
        return ServerResponse.badRequest(exception.getMessage());
    }
}
