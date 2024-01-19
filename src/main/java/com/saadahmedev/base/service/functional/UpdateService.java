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

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;

/**
 * Functional interface for updating entities within a service.
 *
 * @param <I> The type representing the identifier for updating an entity.
 * @param <D> The type representing the request body for updating an entity.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface UpdateService<I, D> {

    /**
     * Updates an entity based on the provided identifier and request body.
     *
     * @param id   The identifier representing the data for updating an entity.
     * @param body The request body representing the updated data for an entity.
     * @return A ResponseEntity representing the result of the update operation.
     * @throws com.saadahmedev.base.exception.exception.BadRequestException If the provided identifier or request body is invalid or incomplete.
     */
    @Nonnull
    @Transactional
    ResponseEntity<?> update(I id, @Nullable D body);
}

