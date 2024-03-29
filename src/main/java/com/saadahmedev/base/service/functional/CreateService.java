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

package com.saadahmedev.base.service.functional;

import org.springframework.http.ResponseEntity;
import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

/**
 * Functional interface for creating entities within a service.
 *
 * @param <D> The type representing the request body for creating an entity.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface CreateService<D> {

    /**
     * Creates an entity based on the provided request body.
     *
     * @param body The request body representing the data for creating an entity.
     * @return A ResponseEntity representing the result of the create operation.
     * @throws com.saadahmedev.base.exception.exception.BadRequestException If the provided request body is invalid or incomplete or any required field is empty or null.
     */
    @Nonnull
    ResponseEntity<?> create(@Nullable D body);
}
