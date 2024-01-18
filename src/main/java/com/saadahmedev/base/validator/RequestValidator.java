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

package com.saadahmedev.base.validator;

import com.saadahmedev.base.exception.exception.ApiException;
import com.saadahmedev.base.exception.exception.BadRequestException;
import com.saadahmedev.base.validator.functional.CreateRequestValidator;
import com.saadahmedev.base.validator.functional.FindRequestValidator;
import com.saadahmedev.base.validator.functional.UpdateRequestValidator;
import org.jetbrains.annotations.NotNull;

/**
 * Abstract base class providing common functionality for request validation.
 * Implements interfaces for creating, finding, and updating entities.
 *
 * @param <I> The type representing the identifier for entities.
 * @param <D> The type representing the request body for entities.
 */
public abstract class RequestValidator<I, D> implements CreateRequestValidator<D>, FindRequestValidator<I>, UpdateRequestValidator<I, D> {

    /**
     * Creates and returns an BadRequestException indicating that a required field is missing.
     *
     * @param field The name of the missing required field.
     * @return BadRequestException indicating that the specified field is required.
     */
    @NotNull
    protected BadRequestException required(String field) {
        return new BadRequestException(field + " is required");
    }

    /**
     * Creates and returns an ApiException based on the provided exception.
     *
     * @param e The exception used to construct the ApiException.
     * @return ApiException created from the provided exception.
     */
    @NotNull
    protected ApiException exception(Exception e) {
        return new ApiException(e);
    }
}
