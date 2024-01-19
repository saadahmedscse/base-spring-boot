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
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
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
@Entity
@Data
public abstract class BaseEntity<I extends Serializable> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private I id;

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
}