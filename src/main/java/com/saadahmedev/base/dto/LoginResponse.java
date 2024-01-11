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

/**
 * Base Spring Boot
 * <p>
 * Login Response simplifies the return body of login request of a RESTful API
 * <p>
 * Date: 01-12-2023
 *
 * @author Saad Ahmed
 * @since 2018
 * @see <a href="https://github.com/saadahmedscse/Android-Popup-Dialog">Android Popup Dialog</a>
 * @see <a href="https://github.com/saadahmedscse/TinyDB">Tiny DB Android</a>
 * @see <a href="https://github.com/saadahmedscse/ShortIntent">Android Short Intent</a>
 */

public class LoginResponse extends ApiResponse {

    @NotNull
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * Create instance of the LoginResponse dto class
     * @param statusCode the status code of the response
     * @param status the status which can be either true or false
     * @param message the message of the login response object
     * @param accessToken the token which will be generated on successful login
     */

    public LoginResponse(@NotNull Integer statusCode, @NotNull Boolean status, @NotNull String message, @NotNull String accessToken) {
        super(statusCode, status, message);
        this.accessToken = accessToken;
    }

    /**
     * Return the access token which can be JWT or anything after successful login request
     * @return the access token which will be generated on successful login
     */

    @NotNull
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Return the string with values of LoginResponse dto
     * @return the string with values of LoginResponse dto
     */

    @Override
    public String toString() {
        return "LoginResponse{" +
                "statusCode=" + super.getStatusCode() +
                ", status=" + super.getStatus() +
                ", message='" + super.getMessage() + '\'' +
                ", accessToken='" + accessToken + '\'' +
                ", timeStamp='" + super.getTimeStamp() + '\'' +
                '}';
    }
}