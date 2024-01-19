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

package com.saadahmedev.base.response;

import com.saadahmedev.base.dto.ApiResponse;
import com.saadahmedev.base.dto.LoginResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;

/**
 * Server Response Utility Class
 *
 * <p>
 * Provides utility methods for creating standardized {@link ResponseEntity} objects
 * for different HTTP responses. It includes methods for internal server error, success,
 * created, bad request, unauthorized, not found, and login responses.
 * </p>
 *
 * @see com.saadahmedev.base.dto.ApiResponse
 * @see com.saadahmedev.base.dto.LoginResponse
 * @see org.springframework.http.ResponseEntity
 * @see org.springframework.http.HttpStatus
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public class ServerResponse {

    /**
     * Returns a {@link ResponseEntity} with internal server error response.
     *
     * @param message The message to be included in the response body.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 500.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> internalServerError(String message) {
        return getErrorResponse(message, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Returns a {@link ResponseEntity} with internal server error response.
     *
     * @param exception The exception to derive the error message from.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 500.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> internalServerError(Exception exception) {
        return getErrorResponse(exception != null ? exception.getMessage() : "Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR);
    }

    /**
     * Returns a {@link ResponseEntity} with success response.
     *
     * @param message The message to be included in the response body.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 200.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> ok(String message) {
        return getSuccessResponse(message, HttpStatus.OK);
    }

    /**
     * Returns a {@link ResponseEntity} with created response.
     *
     * @param message The message to be included in the response body.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 201.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> created(String message) {
        return getSuccessResponse(message, HttpStatus.CREATED);
    }

    /**
     * Returns a {@link ResponseEntity} with the specified status and message.
     * 
     * @param body The object to be included in the response body.
     * @param httpStatus The status code of the response.
     * @return A {@link ResponseEntity<B>} with the provided status code.
     * @param <B> The type of the body
     */
    @NonNull
    public static <B> ResponseEntity<B> body(B body, HttpStatus httpStatus) {
        return new ResponseEntity<>(body, httpStatus);
    }

    /**
     * Returns a {@link ResponseEntity} with bad request response.
     *
     * @param message The message to be included in the response body.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 400.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> badRequest(String message) {
        return getErrorResponse(message, HttpStatus.BAD_REQUEST);
    }

    /**
     * Returns a {@link ResponseEntity} with unauthorized response.
     *
     * @param message The message to be included in the response body.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 401.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> unauthorized(String message) {
        return getErrorResponse(message, HttpStatus.UNAUTHORIZED);
    }

    /**
     * Returns a {@link ResponseEntity} with not found response.
     *
     * @param message The message to be included in the response body.
     * @return A {@link ResponseEntity<ApiResponse>} with status code 404.
     */
    @NonNull
    public static ResponseEntity<ApiResponse> notFound(String message) {
        return getErrorResponse(message, HttpStatus.NOT_FOUND);
    }

    /**
     * Returns a {@link ResponseEntity} with login response.
     *
     * @param message The message to be included in the response body.
     * @param accessToken The access token to be included in the response body.
     * @return A {@link ResponseEntity<LoginResponse>} with status code 200.
     */
    @NonNull
    public static ResponseEntity<LoginResponse> login(String message, String accessToken) {
        return ResponseEntity.ok().body(
                new LoginResponse(
                        HttpStatus.OK.value(),
                        true,
                        message,
                        accessToken
                )
        );
    }

    /**
     * Generates a {@link ResponseEntity<ApiResponse>} with the specified status and message.
     *
     * @param status The status, which can be either true or false in the response body.
     * @param message The message to be included in the response body.
     * @param httpStatus The status code of the response.
     * @return A {@link ResponseEntity<ApiResponse>} with the provided status code.
     */
    @NonNull
    private static ResponseEntity<ApiResponse> generateResponse(boolean status, String message, HttpStatus httpStatus) {
        return new ResponseEntity<>(
                new ApiResponse(
                        httpStatus.value(),
                        status,
                        message != null ? message : "Unexpected Error Occurred"
                ),
                httpStatus
        );
    }

    /**
     * Returns a {@link ResponseEntity<ApiResponse>} with the specified status and message.
     *
     * @param message The message to be included in the response body.
     * @param httpStatus The status code of the response.
     * @return A {@link ResponseEntity<ApiResponse>} with the provided status code.
     */
    @NonNull
    private static ResponseEntity<ApiResponse> getErrorResponse(String message, HttpStatus httpStatus) {
        return generateResponse(false, message, httpStatus);
    }

    /**
     * Returns a {@link ResponseEntity<ApiResponse>} with the specified status and message.
     *
     * @param message The message to be included in the response body.
     * @param httpStatus The status code of the response.
     * @return A {@link ResponseEntity<ApiResponse>} with the provided status code.
     */
    @NonNull
    private static ResponseEntity<ApiResponse> getSuccessResponse(String message, HttpStatus httpStatus) {
        return generateResponse(true, message, httpStatus);
    }
}

