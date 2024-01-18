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

package com.saadahmedev.base.service;

import com.saadahmedev.base.exception.exception.ApiException;
import com.saadahmedev.base.service.functional.*;
import jakarta.annotation.Nonnull;

/**
 * Abstract base class providing common functionality for service operations.
 *
 * @param <I> The type representing the identifier for entities.
 * @param <D> The type representing the request body for entities.
 */
public abstract class BaseService<I, D> implements CreateService<D>, UpdateService<I, D>, FindService<I>, FindAllService, DeleteService<I> {

    /**
     * Creates and returns an ApiException based on the provided exception.
     *
     * @param e The exception used to construct the ApiException.
     * @return ApiException created from the provided exception.
     */
    @Nonnull
    protected ApiException exception(Exception e) {
        return new ApiException(e);
    }
}
