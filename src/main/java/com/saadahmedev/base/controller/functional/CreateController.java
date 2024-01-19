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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Functional interface for creating entities within a controller.
 *
 * @param <D> The type representing the request body for creating an entity.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface CreateController<D> {

    /**
     * Handles the HTTP POST request to create an entity.
     *
     * @param body The request body representing the data for creating an entity.
     * @return A ResponseEntity representing the result of the create operation.
     */
    @Nonnull
    @PostMapping
    ResponseEntity<?> create(@Nullable @RequestBody D body);
}
