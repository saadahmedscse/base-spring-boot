package com.saadahmedev.base.controller.functional

import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@FunctionalInterface
interface BaseUpdateController<ID, DTO> {

    @Nonnull
    @PutMapping("{id}")
    fun update(@PathVariable("id") id: ID, @Nullable @RequestBody body: DTO): ResponseEntity<*>
}