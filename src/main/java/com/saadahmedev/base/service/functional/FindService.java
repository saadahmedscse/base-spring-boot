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
import org.springframework.http.ResponseEntity;

/**
 * Interface for finding entities by their identifier within a service.
 *
 * @param <I> The type representing the identifier for finding an entity.
 */
public interface FindService<I> {

    /**
     * Finds an entity by its identifier.
     *
     * @param id The identifier representing the entity to be found.
     * @return A ResponseEntity representing the result of the find-by-id operation.
     * @throws com.saadahmedev.base.exception.exception.BadRequestException If the provided identifier is invalid or incomplete.
     */
    @Nonnull
    ResponseEntity<?> findById(I id);

    /**
     * Finds a projected view of an entity by its identifier.
     *
     * @param id The identifier representing the entity to be found.
     * @return A ResponseEntity representing the result of the find-projection-by-id operation.
     * @throws com.saadahmedev.base.exception.exception.BadRequestException If the provided identifier is invalid or incomplete.
     */
    @Nonnull
    ResponseEntity<?> findProjection(I id);
}

