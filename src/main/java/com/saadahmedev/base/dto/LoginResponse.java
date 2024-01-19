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

/**
 * LoginResponse Class
 *
 * <p>
 * Represents the response body structure for a login request in a RESTful API.
 * Extends the base ApiResponse class to include an access token generated upon
 * successful login.
 * </p>
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */

public class LoginResponse extends ApiResponse {

    @NotNull
    @JsonProperty("access_token")
    private String accessToken;

    /**
     * Constructs an instance of the LoginResponse class.
     *
     * @param statusCode   The HTTP status code of the response.
     * @param status       The success/failure status of the response.
     * @param message      The message included in the response.
     * @param accessToken  The access token generated upon successful login.
     */

    public LoginResponse(@NotNull Integer statusCode, @NotNull Boolean status, @NotNull String message, @NotNull String accessToken) {
        super(statusCode, status, message);
        this.accessToken = accessToken;
    }

    /**
     * Gets the access token generated upon successful login.
     *
     * @return The access token.
     */

    @NotNull
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * Returns a JSON representation of the LoginResponse instance.
     *
     * @return A JSON string representing the values of the LoginResponse instance.
     */

    @SneakyThrows
    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }
}