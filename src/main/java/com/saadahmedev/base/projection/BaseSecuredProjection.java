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
 * Base Secured Projection Interface
 *
 * <p>
 * This interface extends the {@link BaseProjection} interface to include additional security-related fields
 * such as isDeleted, isLocked, isActive, and isExpired. It represents the foundational structure for secured
 * projections within the application.
 * </p>
 *
 * @param <I> The type representing the identifier for the projection.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public interface BaseSecuredProjection<I extends Serializable> extends BaseProjection<I> {

    /**
     * Gets the flag indicating whether the projection is deleted.
     *
     * @return True if the projection is deleted; otherwise, false.
     */
    Boolean getIsDeleted();

    /**
     * Gets the flag indicating whether the projection is locked.
     *
     * @return True if the projection is locked; otherwise, false.
     */
    Boolean getIsLocked();

    /**
     * Gets the flag indicating whether the projection is active.
     *
     * @return True if the projection is active; otherwise, false.
     */
    Boolean getIsActive();

    /**
     * Gets the flag indicating whether the projection is expired.
     *
     * @return True if the projection is expired; otherwise, false.
     */
    Boolean getIsExpired();
}
