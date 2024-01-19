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

import com.saadahmedev.base.util.DateUtil;
import jakarta.persistence.*;

import java.io.Serializable;

/**
 * Abstract Base Entity Class
 *
 * <p>
 * Represents the foundational structure for entities within the application.
 * Provides common fields such as identifier, creation and update timestamps,
 * creation and update dates, and identifiers for the user who created and
 * last updated the entity.
 * </p>
 *
 * @param <I> The type representing the identifier for entities.
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
@MappedSuperclass
public abstract class BaseEntity<I extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected I id;

    private Long createdTime;
    private Long updatedTime;
    private String createdDate;
    private String updatedDate;
    private I createdById;
    private I updatedById;

    /**
     * Default constructor for BaseEntity.
     */
    protected BaseEntity() {
    }

    /**
     * Parameterized constructor for BaseEntity.
     *
     * @param createdTime The timestamp representing the creation time of the entity.
     * @param updatedTime The timestamp representing the last update time of the entity.
     * @param createdById The identifier of the user who created the entity.
     * @param updatedById The identifier of the user who last updated the entity.
     */
    public BaseEntity(Long createdTime, Long updatedTime, I createdById, I updatedById) {
        this.createdTime = createdTime;
        this.updatedTime = updatedTime;
        this.createdDate = DateUtil.getInstant(createdTime);
        this.updatedDate = DateUtil.getInstant(updatedTime);
        this.createdById = createdById;
        this.updatedById = updatedById;
    }

    /**
     * Get the identifier of the BaseEntity.
     *
     * @return The identifier of the BaseEntity.
     */
    public I getId() {
        return id;
    }

    /**
     * Set the identifier of the BaseEntity.
     *
     * @param id The new identifier to set for the BaseEntity.
     */
    public void setId(I id) {
        this.id = id;
    }

    /**
     * Get the timestamp representing the creation time of the BaseEntity.
     *
     * @return The creation timestamp of the BaseEntity.
     */
    public Long getCreatedTime() {
        return createdTime;
    }

    /**
     * Set the timestamp representing the creation time of the BaseEntity.
     *
     * @param createdTime The new creation timestamp to set for the BaseEntity.
     */
    public void setCreatedTime(Long createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * Get the timestamp representing the last update time of the BaseEntity.
     *
     * @return The last update timestamp of the BaseEntity.
     */
    public Long getUpdatedTime() {
        return updatedTime;
    }

    /**
     * Set the timestamp representing the last update time of the BaseEntity.
     *
     * @param updatedTime The new last update timestamp to set for the BaseEntity.
     */
    public void setUpdatedTime(Long updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * Get the creation date of the BaseEntity.
     *
     * @return The creation date of the BaseEntity.
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Set the creation date of the BaseEntity.
     *
     * @param createdDate The new creation date to set for the BaseEntity.
     */
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    /**
     * Get the last update date of the BaseEntity.
     *
     * @return The last update date of the BaseEntity.
     */
    public String getUpdatedDate() {
        return updatedDate;
    }

    /**
     * Set the last update date of the BaseEntity.
     *
     * @param updatedDate The new last update date to set for the BaseEntity.
     */
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    /**
     * Get the identifier of the user who created the BaseEntity.
     *
     * @return The identifier of the user who created the BaseEntity.
     */
    public I getCreatedById() {
        return createdById;
    }

    /**
     * Set the identifier of the user who created the BaseEntity.
     *
     * @param createdById The new identifier of the user who created the BaseEntity.
     */
    public void setCreatedById(I createdById) {
        this.createdById = createdById;
    }

    /**
     * Get the identifier of the user who last updated the BaseEntity.
     *
     * @return The identifier of the user who last updated the BaseEntity.
     */
    public I getUpdatedById() {
        return updatedById;
    }

    /**
     * Set the identifier of the user who last updated the BaseEntity.
     *
     * @param updatedById The new identifier of the user who last updated the BaseEntity.
     */
    public void setUpdatedById(I updatedById) {
        this.updatedById = updatedById;
    }
}