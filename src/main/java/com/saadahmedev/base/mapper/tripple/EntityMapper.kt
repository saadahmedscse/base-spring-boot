package com.saadahmedev.base.mapper.tripple

@FunctionalInterface
interface EntityMapper<E, A, B, C> {

    fun toEntity(p0: A, p1: B, p2: C): E
}