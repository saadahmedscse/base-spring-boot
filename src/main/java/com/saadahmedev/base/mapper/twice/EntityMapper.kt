package com.saadahmedev.base.mapper.twice

@FunctionalInterface
interface EntityMapper<E, A, B> {

    fun toEntity(p0: A, p1: B): E
}