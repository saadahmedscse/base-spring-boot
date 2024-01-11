package com.saadahmedev.base.projection

interface BaseProjection<I> {

    fun getId(): I

    fun getCreatedTime(): Long

    fun getUpdatedTime(): Long

    fun getCreatedDate(): String

    fun getUpdatedDate(): String

    fun getCreatedById(): I

    fun getUpdatedById(): I
}