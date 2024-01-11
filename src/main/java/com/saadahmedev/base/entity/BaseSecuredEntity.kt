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