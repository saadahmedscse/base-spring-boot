package com.saadahmedev.base.service.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseFindAllService {

    @Nonnull
    fun findAll(): ResponseEntity<List<*>>
}