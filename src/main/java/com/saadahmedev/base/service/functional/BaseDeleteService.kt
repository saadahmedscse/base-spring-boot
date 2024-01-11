package com.saadahmedev.base.service.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseDeleteService<I> {

    @Nonnull
    fun delete(id: I): ResponseEntity<*>
}