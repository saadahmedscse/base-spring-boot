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

package com.saadahmedev.base.mapper.single;

/**
 * Functional Interface for Single-Parameter Entity Mapping
 *
 * <p>
 * This functional interface provides a method to convert an object to an entity of type {@link E} with an arg of type {@link A}.
 * </p>
 *
 * @param <E> The type representing the entity.
 * @param <A> The type of the argument to be passed to the {@link #toEntity(A)}} method.
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface EntityMapper<E, A> {

    /**
     * Converts an object to an entity of type {@link E} with an arg of type {@link A}.
     *
     * @param p0 The argument to be passed.
     * @return The entity object of type {@link E}.
     */
    E toEntity(A p0);
}
