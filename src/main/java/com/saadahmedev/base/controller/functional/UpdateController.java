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
import jakarta.annotation.Nullable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Functional Interface for Updating Entities within a Controller.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface UpdateController<I, D> {

    /**
     * Handles the HTTP PUT request to update an entity by its identifier.
     *
     * @param id   The identifier representing the entity to be updated.
     * @param body The request body containing the updated data for the entity.
     * @return A ResponseEntity representing the result of the update operation.
     * @throws IllegalArgumentException If the provided identifier is invalid or incomplete.
     */
    @Nonnull
    @PutMapping("{id}")
    ResponseEntity<?> update(@PathVariable("id") I id, @Nullable @RequestBody D body);
}
