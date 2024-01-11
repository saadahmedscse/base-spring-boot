package com.saadahmedev.base.mapper

@FunctionalInterface
interface DoubleArgsEntityMapper<E, A, B> {

    fun toEntity(p0: A, p1: B): E
}