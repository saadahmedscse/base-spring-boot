package com.saadahmedev.base.mapper.normal

@FunctionalInterface
interface EntityMapper<E> {

    fun toEntity(): E
}