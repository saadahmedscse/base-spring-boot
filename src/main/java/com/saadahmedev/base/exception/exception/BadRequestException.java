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

package com.saadahmedev.base.exception.exception;

import org.jetbrains.annotations.NotNull;

import java.lang.Exception;

/**
 * Custom Exception Class for Bad Request Exceptions
 *
 * <p>
 * Represents a custom exception class specifically designed for handling bad request
 * exceptions. Extends the RuntimeException class to provide flexibility in exception
 * handling without being explicitly declared in method signatures.
 * </p>
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public class BadRequestException extends RuntimeException {

    /**
     * Constructs a new BadRequestException with no specified detail message.
     */
    public BadRequestException() {
        super();
    }

    /**
     * Constructs a new BadRequestException with the specified detail message.
     *
     * @param message The detail message.
     */
    public BadRequestException(String message) {
        super(message);
    }

    /**
     * Constructs a new BadRequestException with the specified detail message and cause.
     *
     * @param message The detail message.
     * @param cause   The cause of the exception.
     */
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Constructs a new BadRequestException with the specified cause.
     *
     * @param cause The cause of the exception.
     */
    public BadRequestException(Throwable cause) {
        super(cause);
    }

    /**
     * Constructs a new BadRequestException with information from another exception.
     *
     * @param exception The original exception to derive information from.
     */
    public BadRequestException(@NotNull Exception exception) {
        super(exception.getMessage() != null ? exception.getMessage() : "Unexpected error occurred");
    }
}
