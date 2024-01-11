package com.saadahmedev.base.controller.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@FunctionalInterface
interface BaseFindAllController {

    @Nonnull
    @GetMapping
    fun findAll(): ResponseEntity<List<*>>
}