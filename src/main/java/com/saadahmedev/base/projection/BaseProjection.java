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

package com.saadahmedev.base.projection;

import java.io.Serializable;

/**
 * Base Projection Interface
 *
 * <p>
 * This interface defines a projection with common fields like ID, created time, updated time, created date,
 * updated date, created by ID, and updated by ID. It is intended to be extended by other projection interfaces.
 * </p>
 *
 * @param <I> The type representing the identifier for the projection.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public interface BaseProjection<I extends Serializable> {

    /**
     * Gets the ID of the projection.
     *
     * @return The ID of the projection.
     */
    I getId();

    /**
     * Gets the timestamp when the projection was created.
     *
     * @return The created timestamp of the projection.
     */
    Long getCreatedTime();

    /**
     * Gets the timestamp when the projection was last updated.
     *
     * @return The updated timestamp of the projection.
     */
    Long getUpdatedTime();

    /**
     * Gets the formatted date when the projection was created.
     *
     * @return The created date of the projection.
     */
    String getCreatedDate();

    /**
     * Gets the formatted date when the projection was last updated.
     *
     * @return The updated date of the projection.
     */
    String getUpdatedDate();

    /**
     * Gets the ID of the user who created the projection.
     *
     * @return The created by user ID.
     */
    I getCreatedById();

    /**
     * Gets the ID of the user who last updated the projection.
     *
     * @return The updated by user ID.
     */
    I getUpdatedById();
}
