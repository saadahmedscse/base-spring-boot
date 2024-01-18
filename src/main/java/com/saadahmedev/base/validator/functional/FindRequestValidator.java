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

package com.saadahmedev.base.validator.functional;

import com.saadahmedev.base.exception.exception.ApiException;

/**
 * Functional interface for validating find requests.
 *
 * @param <I> The type representing the identifier for finding an entity.
 */
@FunctionalInterface
public interface FindRequestValidator<I> {

    /**
     * Validates the find request based on the provided identifier.
     *
     * @param id The identifier representing the data for finding an entity.
     * @throws ApiException If the validation fails and an exception needs to be thrown.
     */
    void validateFindRequest(I id) throws ApiException;
}

