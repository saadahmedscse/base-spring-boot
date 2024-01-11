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

package com.saadahmedev.base.response

import com.saadahmedev.base.dto.ApiResponse
import com.saadahmedev.base.dto.LoginResponse
import com.saadahmedev.base.util.Constants.Server
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import java.lang.Exception

/**
 * Server Response
 *
 * Server Response simplifies the return body of http request of a RESTful API
 *
 * Date: 01-12-2023
 *
 * @author Saad Ahmed
 * @since 2018
 * @see <a href="https://github.com/saadahmedscse/Android-Popup-Dialog">Android Popup Dialog</a>
 * @see <a href="https://github.com/saadahmedscse/TinyDB">Tiny DB Android</a>
 * @see <a href="https://github.com/saadahmedscse/ShortIntent">Android Short Intent</a>
 */

object ServerResponse {

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 500
     */

    fun internalServerError(message: String = Server.Message.INTERNAL_SERVER_ERROR) =
        getErrorResponse(
            message,
            HttpStatus.INTERNAL_SERVER_ERROR
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param exception the message of the exception which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 500
     */

    fun internalServerError(exception: Exception?) =
        getErrorResponse(
            exception?.localizedMessage ?: Server.Message.INTERNAL_SERVER_ERROR,
            HttpStatus.INTERNAL_SERVER_ERROR
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 200
     */

    fun ok(message: String = Server.Message.SUCCESS) =
        getSuccessResponse(
            message,
            HttpStatus.OK
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 201
     */

    fun created(message: String = Server.Message.CREATED) =
        getSuccessResponse(
            message,
            HttpStatus.CREATED
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param t any object which will be returned in the body
     * @param httpStatus the status code of the response
     * @return the ResponseEntity<Any> which will be returned in the body with provided status code
     */

    fun body(t: Any, httpStatus: HttpStatus = HttpStatus.OK): ResponseEntity<Any> = ResponseEntity(t, httpStatus)

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 400
     */

    fun badRequest(message: String? = Server.Message.BAD_REQUEST) =
        getErrorResponse(
            message,
            HttpStatus.BAD_REQUEST
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 401
     */

    fun unauthorized(message: String? = Server.Message.UNAUTHORIZED) =
        getErrorResponse(
            message,
            HttpStatus.UNAUTHORIZED
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @return the ResponseEntity<ApiResponse> which will be returned in the body with status code 404
     */

    fun notFound(message: String? = Server.Message.NOT_FOUND) =
        getErrorResponse(
            message,
            HttpStatus.NOT_FOUND
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @param accessToken the access token which a user will get after login
     * @return the ResponseEntity<LoginResponse> which will be returned in the body with status code 200
     */

    fun login(message: String = Server.Message.SUCCESS, accessToken: String): ResponseEntity<LoginResponse> =
        ResponseEntity.ok().body(
            LoginResponse(
                HttpStatus.OK.value(),
                true,
                message,
                accessToken
            )
        )

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @param httpStatus the status code of the response
     * @return the ResponseEntity<LoginResponse> which will be returned in the body with status true and provided status code
     */

    private fun getSuccessResponse(message: String?, httpStatus: HttpStatus) = generateResponse(true, message, httpStatus)

    /**
     * Return the ResponseEntity<?> with the specified status and message.
     * @param message the message which will be returned in the body
     * @param httpStatus the status code of the response
     * @return the ResponseEntity<LoginResponse> which will be returned in the body with status false and provided status code
     */

    private fun getErrorResponse(message: String?, httpStatus: HttpStatus) = generateResponse(false, message, httpStatus)

    /**
     * Generates the ResponseEntity<ApiResponse> with the specified status and message.
     * @param status the status, which can be either true or false in the response body
     * @param message the message which will be returned in the body
     * @param httpStatus the status code of the response
     * @return the ResponseEntity<LoginResponse> which will be returned in the body with status false and provided status code
     */

    private fun generateResponse(
        status: Boolean,
        message: String?,
        httpStatus: HttpStatus
    ): ResponseEntity<ApiResponse> {
        return ResponseEntity(
            ApiResponse(
                httpStatus.value(),
                status,
                message ?: "Unexpected Error Occurred"
            ),
            httpStatus
        )
    }
}