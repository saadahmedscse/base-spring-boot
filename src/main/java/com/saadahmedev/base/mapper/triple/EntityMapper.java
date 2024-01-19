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

package com.saadahmedev.base.mapper.triple;

/**
 * Functional Interface for Triple-Parameter Entity Mapping
 *
 * <p>
 * This functional interface provides a method to convert object to an entity of type {@link E} with args of types {@link A}, {@link B}, and {@link C}.
 * </p>
 *
 * @param <E> The type representing the entity.
 * @param <A> The type of the first argument to be passed to the {@link #toEntity(A, B, C)}} method.
 * @param <B> The type of the second argument to be passed to the {@link #toEntity(A, B, C)}} method.
 * @param <C> The type of the third argument to be passed to the {@link #toEntity(A, B, C)}} method.
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@FunctionalInterface
public interface EntityMapper<E, A, B, C> {

    /**
     * Converts objects to an entity of type {@link E} with args of types {@link A}, {@link B}, and {@link C}.
     *
     * @param p0 The first argument to be passed.
     * @param p1 The second argument to be passed.
     * @param p2 The third argument to be passed.
     * @return The entity object of type {@link E}.
     */
    E toEntity(A p0, B p1, C p2);
}
