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

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import jakarta.persistence.MappedSuperclass;

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
@MappedSuperclass
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
    public BaseSecuredEntity(@Nonnull Long createdTime, @Nullable Long updatedTime, @Nonnull I createdById, @Nullable I updatedById, @Nonnull Boolean isDeleted, @Nonnull Boolean isActive, @Nonnull Boolean isExpired, @Nonnull Boolean isLocked) {
        super(createdTime, updatedTime, createdById, updatedById);
        this.isDeleted = isDeleted;
        this.isActive = isActive;
        this.isExpired = isExpired;
        this.isLocked = isLocked;
    }

    /**
     * Get the deletion status of the BaseSecuredEntity.
     *
     * @return True if the entity is marked as deleted, false otherwise.
     */
    public Boolean getDeleted() {
        return isDeleted;
    }

    /**
     * Set the deletion status of the BaseSecuredEntity.
     *
     * @param deleted The new deletion status to set for the BaseSecuredEntity.
     */
    public void setDeleted(@Nonnull Boolean deleted) {
        isDeleted = deleted;
    }

    /**
     * Get the activation status of the BaseSecuredEntity.
     *
     * @return True if the entity is active, false otherwise.
     */
    public Boolean getActive() {
        return isActive;
    }

    /**
     * Set the activation status of the BaseSecuredEntity.
     *
     * @param active The new activation status to set for the BaseSecuredEntity.
     */
    public void setActive(@Nonnull Boolean active) {
        isActive = active;
    }

    /**
     * Get the expiration status of the BaseSecuredEntity.
     *
     * @return True if the entity is expired, false otherwise.
     */
    public Boolean getExpired() {
        return isExpired;
    }

    /**
     * Set the expiration status of the BaseSecuredEntity.
     *
     * @param expired The new expiration status to set for the BaseSecuredEntity.
     */
    public void setExpired(@Nonnull Boolean expired) {
        isExpired = expired;
    }

    /**
     * Get the lock status of the BaseSecuredEntity.
     *
     * @return True if the entity is locked, false otherwise.
     */
    public Boolean getLocked() {
        return isLocked;
    }

    /**
     * Set the lock status of the BaseSecuredEntity.
     *
     * @param locked The new lock status to set for the BaseSecuredEntity.
     */
    public void setLocked(@Nonnull Boolean locked) {
        isLocked = locked;
    }
}
