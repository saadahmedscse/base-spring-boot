package com.saadahmedev.base.mapper

@FunctionalInterface
interface EntityMapper<E> {

    fun toEntity(): E
}