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

import com.saadahmedev.base.util.DateUtil
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import lombok.Data
import java.io.Serializable

@Entity
@Data
abstract class BaseEntity<I : Serializable> protected constructor() {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: I? = null
    private var createdTime: Long? = null
    private var updatedTime: Long? = null
    private var createdDate: String? = null
    private var updatedDate: String? = null
    private var createdById: I? = null
    private var updatedById: I? = null

    constructor(
        createdTime: Long = System.currentTimeMillis(),
        updatedTime: Long = System.currentTimeMillis(),
        createdById: I,
        updatedById: I? = null
    ) : this() {
        this.createdTime = createdTime
        this.updatedTime = updatedTime
        this.createdDate = DateUtil.getInstant(createdTime)
        this.updatedDate = DateUtil.getInstant(updatedTime)
        this.createdById = createdById
        this.updatedById = updatedById
    }
}