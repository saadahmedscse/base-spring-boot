package com.saadahmedev.base.projection

interface BaseSecuredProjection<I> : BaseProjection<I> {

    fun getIsDeleted(): Boolean

    fun getIsLocked(): Boolean

    fun getIsActive(): Boolean

    fun getIsExpired(): Boolean
}