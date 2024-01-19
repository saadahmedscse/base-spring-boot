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

package com.saadahmedev.base.mapper.twice;

/**
 * Functional Interface for Double-Parameter Entity Mapping
 *
 * <p>
 * This functional interface provides a method to convert object to an entity of type {@link E} with args of types {@link A} and {@link B}.
 * </p>
 *
 * @param <E> The type representing the entity.
 * @param <A> The type of the first argument to be passed to the {@link #toEntity(A, B)}} method.
 * @param <B> The type of the second argument to be passed to the {@link #toEntity(A, B)}} method.
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface EntityMapper<E, A, B> {

    /**
     * Converts objects to an entity of type {@link E} with args of types {@link A} and {@link B}.
     *
     * @param p0 The first argument to be passed.
     * @param p1 The second argument to be passed.
     * @return The entity object of type {@link E}.
     */
    E toEntity(A p0, B p1);
}
