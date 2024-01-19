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

package com.saadahmedev.base.controller.functional;

import jakarta.annotation.Nonnull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Functional Interface for Deleting Entities by Identifier within a Controller.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface DeleteController<I> {

    /**
     * Handles the HTTP DELETE request to delete an entity by its identifier.
     *
     * @param id The identifier representing the entity to be deleted.
     * @return A ResponseEntity representing the result of the delete-by-id operation.
     * @throws com.saadahmedev.base.exception.exception.BadRequestException If the provided identifier is invalid or incomplete.
     */
    @Nonnull
    @DeleteMapping("{id}")
    ResponseEntity<?> deleteById(@PathVariable("id") I id);
}

