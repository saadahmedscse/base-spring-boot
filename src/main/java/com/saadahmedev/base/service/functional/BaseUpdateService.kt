package com.saadahmedev.base.service.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseUpdateService<I, D> {

    @Nonnull
    fun update(id: I, body: D): ResponseEntity<*>
}