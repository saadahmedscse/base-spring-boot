package com.saadahmedev.base.mapper

@FunctionalInterface
interface SingleArgsEntityMapper<E, A> {

    fun toEntity(p0: A): E
}