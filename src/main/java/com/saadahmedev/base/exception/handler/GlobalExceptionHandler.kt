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

package com.saadahmedev.base.exception.handler

import com.saadahmedev.base.exception.exception.ApiException
import com.saadahmedev.base.exception.exception.BadRequestException
import com.saadahmedev.base.exception.exception.UnauthorizedException
import com.saadahmedev.base.response.ServerResponse
import org.springframework.http.ResponseEntity
import org.springframework.http.converter.HttpMessageNotReadableException
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(ApiException::class)
    fun handleApiException(exception: ApiException): ResponseEntity<*> {
        return ServerResponse.internalServerError(exception = exception)
    }

    @ExceptionHandler(BadRequestException::class)
    fun handleBadRequestException(exception: BadRequestException): ResponseEntity<*> {
        return ServerResponse.badRequest(message = exception.message)
    }

    @ExceptionHandler(UnauthorizedException::class)
    fun handleUnauthorizedException(exception: UnauthorizedException): ResponseEntity<*> {
        return ServerResponse.unauthorized(message = exception.message)
    }

    @ExceptionHandler(HttpMessageNotReadableException::class)
    fun handleMessageNotReadableException(exception: HttpMessageNotReadableException): ResponseEntity<*> {
        return ServerResponse.badRequest(message = exception.message)
    }
}