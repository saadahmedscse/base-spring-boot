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

package com.saadahmedev.base.exception.thrower;

import com.saadahmedev.base.exception.exception.ApiException;
import com.saadahmedev.base.exception.exception.BadRequestException;

import java.lang.Exception;

/**
 * Abstract Exception Thrower Class
 *
 * <p>
 * This abstract class provides utility methods to throw specific exceptions commonly used in applications.
 * </p>
 * <p>
 * Extend this class and use its methods to throw exceptions with predefined messages.
 * </p>
 * <p>
 * Example usage: {@code throw required("fieldName");}
 * </p>
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public abstract class ExceptionThrower {

    /**
     * Throws a BadRequestException indicating that the specified field is required.
     *
     * @param field The name of the required field.
     * @return A {@link BadRequestException} indicating that the specified field is required.
     */
    public BadRequestException required(String field) {
        return new BadRequestException("Field '" + field + "' is required");
    }

    /**
     * Throws a BadRequestException with the specified custom message.
     *
     * @param message The custom message for the BadRequestException.
     * @return A {@link BadRequestException} with the specified custom message.
     */
    public BadRequestException message(String message) {
        return new BadRequestException(message);
    }

    /**
     * Throws an {@link ApiException} with information from the provided exception.
     *
     * @param exception The original exception to derive information from.
     * @return An {@link ApiException} with information from the provided exception.
     */
    public ApiException exception(Exception exception) {
        return new ApiException(exception);
    }
}