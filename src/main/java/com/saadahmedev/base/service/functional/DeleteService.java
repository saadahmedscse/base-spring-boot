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
import jakarta.transaction.Transactional;
import org.springframework.http.ResponseEntity;

/**
 * Functional interface for deleting entities by their identifier within a service.
 *
 * @param <I> The type representing the identifier for deleting an entity.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface DeleteService<I> {

    /**
     * Deletes an entity by its identifier.
     *
     * @param id The identifier representing the entity to be deleted.
     * @return A ResponseEntity representing the result of the delete-by-id operation.
     * @throws com.saadahmedev.base.exception.exception.BadRequestException If the provided identifier is invalid or incomplete.
     */
    @Nonnull
    @Transactional
    ResponseEntity<?> deleteById(I id);
}
