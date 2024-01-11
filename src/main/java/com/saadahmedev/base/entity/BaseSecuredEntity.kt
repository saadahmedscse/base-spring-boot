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

package com.saadahmedev.base.entity

import jakarta.persistence.Entity
import lombok.Data
import java.io.Serializable

@Entity
@Data
abstract class BaseSecuredEntity<I : Serializable> : BaseEntity<I> {
    private var isDeleted: Boolean? = null
    private var isActive: Boolean? = null
    private var isExpired: Boolean? = null
    private var isLocked: Boolean? = null

    protected constructor() : super()

    constructor(
        createdTime: Long = System.currentTimeMillis(),
        updatedTime: Long = System.currentTimeMillis(),
        createdById: I,
        updatedById: I? = null,
        isDeleted: Boolean,
        isActive: Boolean,
        isExpired: Boolean,
        isLocked: Boolean
    ) : super(createdTime, updatedTime, createdById, updatedById) {
        this.isDeleted = isDeleted
        this.isActive = isActive
        this.isExpired = isExpired
        this.isLocked = isLocked
    }
}