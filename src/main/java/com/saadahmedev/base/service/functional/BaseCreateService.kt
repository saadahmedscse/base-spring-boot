package com.saadahmedev.base.service.functional

import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable
import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseCreateService<D> {

    @Nonnull
    fun create(@Nullable body: D): ResponseEntity<*>
}