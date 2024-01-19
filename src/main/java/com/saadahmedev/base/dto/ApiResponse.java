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

package com.saadahmedev.base.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.saadahmedev.base.exception.exception.ApiException;
import jakarta.annotation.Nonnull;

import java.util.Date;

/**
 * ApiResponse Class
 *
 * <p>
 * Represents the response body structure for HTTP requests in a RESTful API.
 * The class provides a standardized format including status code, success/failure status,
 * message, and a timestamp.
 * </p>
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */

public class ApiResponse {

    @JsonProperty("status_code")
    private final Integer statusCode;
    private final Boolean status;
    private final String message;
    @JsonProperty("time_stamp")
    private final String timeStamp;

    /**
     * Constructs an instance of the ApiResponse class.
     *
     * @param statusCode The HTTP status code of the response.
     * @param status     The success/failure status of the response.
     * @param message    The message included in the response.
     */

    public ApiResponse(@Nonnull Integer statusCode, @Nonnull Boolean status, @Nonnull String message) {
        this.statusCode = statusCode;
        this.status = status;
        this.message = message;
        this.timeStamp = new Date().toInstant().toString();
    }

    /**
     * Gets the HTTP status code from the response.
     *
     * @return The HTTP status code.
     */

    @Nonnull
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Gets the success/failure status from the response.
     *
     * @return The success/failure status.
     */

    @Nonnull
    public Boolean getStatus() {
        return status;
    }

    /**
     * Gets the response message from the response.
     *
     * @return The response message.
     */

    @Nonnull
    public String getMessage() {
        return message;
    }

    /**
     * Gets the timestamp included in the response.
     *
     * @return The timestamp.
     */

    @Nonnull
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Returns a JSON representation of the ApiResponse instance.
     *
     * <p>
     * This method utilizes the Jackson ObjectMapper to serialize the ApiResponse instance
     * into a JSON string, providing a string representation of the object's values.
     * </p>
     *
     * @return A JSON string with the values of the ApiResponse instance.
     */

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException exception) {
            throw new ApiException(exception);
        }
    }
}