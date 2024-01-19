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

package com.saadahmedev.base.mapper.normal;

/**
 * Functional Interface for Entity Mapping
 *
 * <p>
 * This functional interface provides a method to convert an object to an entity of type {@link E}.
 * </p>
 *
 * @param <E> The type representing the entity.
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface EntityMapper<E> {

    /**
     * Converts an object to an entity of type {@link E}.
     *
     * @return The entity object of type {@link E}.
     */
    E toEntity();
}
