package com.saadahmedev.base.mapper.single

@FunctionalInterface
interface EntityMapper<E, A> {

    fun toEntity(p0: A): E
}