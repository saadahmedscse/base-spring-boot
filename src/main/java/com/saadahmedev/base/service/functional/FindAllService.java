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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

/**
 * Interface for finding all entities within a service.
 */
public interface FindAllService {

    /**
     * Finds all entities without pagination.
     *
     * @return A ResponseEntity representing the result of the find all operation.
     */
    @Nonnull
    ResponseEntity<?> findAll();

    /**
     * Finds all entities with pagination.
     *
     * @param pageable The Pageable object specifying the pagination information.
     * @return A Page of entities and a ResponseEntity representing the result of the find all operation.
     */
    @Nonnull
    Page<?> findAll(@Nonnull Pageable pageable);
}

