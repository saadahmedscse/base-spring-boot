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
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.jetbrains.annotations.NotNull;

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

    @NotNull
    @JsonProperty("status_code")
    private final Integer statusCode;
    @NotNull
    private final Boolean status;
    @NotNull
    private final String message;
    @NotNull
    @JsonProperty("time_stamp")
    private final String timeStamp;

    /**
     * Constructs an instance of the ApiResponse class.
     *
     * @param statusCode The HTTP status code of the response.
     * @param status     The success/failure status of the response.
     * @param message    The message included in the response.
     */

    public ApiResponse(@NotNull Integer statusCode, @NotNull Boolean status, @NotNull String message) {
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

    @NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Gets the success/failure status from the response.
     *
     * @return The success/failure status.
     */

    @NotNull
    public Boolean getStatus() {
        return status;
    }

    /**
     * Gets the response message from the response.
     *
     * @return The response message.
     */

    @NotNull
    public String getMessage() {
        return message;
    }

    /**
     * Gets the timestamp included in the response.
     *
     * @return The timestamp.
     */

    @NotNull
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

    @SneakyThrows
    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }
}