package com.saadahmedev.base.controller.functional

import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody

@FunctionalInterface
interface BaseCreateController<DTO> {

    @Nonnull
    @PostMapping("create")
    fun create(@Nullable @RequestBody body: DTO): ResponseEntity<*>
}