package com.saadahmedev.base.service.functional

import jakarta.annotation.Nullable
import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseCreateService<D> {

    fun create(@Nullable body: D): ResponseEntity<*>
}