package com.saadahmedev.base.service.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseFindService<I> {

    @Nonnull
    fun findById(id: I): ResponseEntity<*>
}