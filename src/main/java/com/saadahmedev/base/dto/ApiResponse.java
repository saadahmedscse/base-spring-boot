/*
 * Copyright 2018-2023 Saad Ahmed
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
import org.jetbrains.annotations.NotNull;

import java.util.Date;

/**
 * Base Spring Boot
 * <p>
 * Api Response simplifies the return body of http request of a RESTful API
 * <p>
 * Date: 01-12-2023
 *
 * @author Saad Ahmed
 * @see <a href="https://github.com/saadahmedscse/Android-Popup-Dialog">Android Popup Dialog</a>
 * @see <a href="https://github.com/saadahmedscse/TinyDB">Tiny DB Android</a>
 * @see <a href="https://github.com/saadahmedscse/ShortIntent">Android Short Intent</a>
 * @since 2018
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
     * Create instance of the LoginResponse dto class
     *
     * @param statusCode the status code of the response
     * @param status     the status which can be either true or false
     * @param message    the message of the api response object
     */

    public ApiResponse(@NotNull Integer statusCode, @NotNull Boolean status, @NotNull String message) {
        this.statusCode = statusCode;
        this.status = status;
        this.message = message;
        this.timeStamp = new Date().toInstant().toString();
    }

    /**
     * Return the status code in the response body
     *
     * @return the https status code in the response body
     */

    @NotNull
    public Integer getStatusCode() {
        return statusCode;
    }

    /**
     * Return the success or failed status in the response body
     *
     * @return true or false as status in the response body
     */

    @NotNull
    public Boolean getStatus() {
        return status;
    }

    /**
     * Return the response message in the response body
     *
     * @return the response message in the response body
     */

    @NotNull
    public String getMessage() {
        return message;
    }

    /**
     * Return the time stamp in the response body
     *
     * @return generates the current date time stamp and return as time stamp in the response body
     */

    @NotNull
    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * Return the string with values of ApiResponse dto
     *
     * @return the string with values of ApiResponse dto
     */

    @Override
    public String toString() {
        return "ApiResponse{" +
                "statusCode=" + statusCode +
                ", status=" + status +
                ", message='" + message + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                '}';
    }
}