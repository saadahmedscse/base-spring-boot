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

package com.saadahmedev.base.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Abstract Base Secured Entity Class
 *
 * <p>
 * Extends the BaseEntity class to include additional security-related fields such as
 * isDeleted, isActive, isExpired, and isLocked. Represents the foundational structure
 * for secured entities within the application.
 * </p>
 *
 * @param <I> The type representing the identifier for entities.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@Entity
@Setter
@Getter
public abstract class BaseSecuredEntity<I extends Serializable> extends BaseEntity<I> {

    private Boolean isDeleted;
    private Boolean isActive;
    private Boolean isExpired;
    private Boolean isLocked;

    /**
     * Default constructor for BaseSecuredEntity.
     */
    protected BaseSecuredEntity() {
        super();
    }

    /**
     * Parameterized constructor for BaseSecuredEntity.
     *
     * @param createdTime The timestamp representing the creation time of the entity.
     * @param updatedTime The timestamp representing the last update time of the entity.
     * @param createdById The identifier of the user who created the entity.
     * @param updatedById The identifier of the user who last updated the entity.
     * @param isDeleted   The flag indicating whether the entity is marked as deleted.
     * @param isActive    The flag indicating whether the entity is active.
     * @param isExpired   The flag indicating whether the entity is expired.
     * @param isLocked    The flag indicating whether the entity is locked.
     */
    public BaseSecuredEntity(Long createdTime, Long updatedTime, I createdById, I updatedById, Boolean isDeleted, Boolean isActive, Boolean isExpired, Boolean isLocked) {
        super(createdTime, updatedTime, createdById, updatedById);
        this.isDeleted = isDeleted;
        this.isActive = isActive;
        this.isExpired = isExpired;
        this.isLocked = isLocked;
    }
}
