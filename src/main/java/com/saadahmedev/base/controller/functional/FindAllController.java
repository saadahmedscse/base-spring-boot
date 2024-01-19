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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Interface for finding all items within an Entity.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public interface FindAllController {

    /**
     * Handles the HTTP GET request to find all items without pagination.
     *
     * @return A ResponseEntity representing the result of the find all operation.
     */
    @Nonnull
    @GetMapping
    ResponseEntity<?> findAll();

    /**
     * Handles the HTTP GET request to find all items with pagination.
     *
     * @param page The page number for pagination (default is 0).
     * @param size The page size for pagination (default is 10).
     * @return A ResponseEntity representing the result of the find all operation with pagination.
     */
    @Nonnull
    @GetMapping("page")
    ResponseEntity<?> findAll(@RequestParam(value = "page", defaultValue = "0") int page, @RequestParam(value = "size", defaultValue = "10") int size);
}

