package com.saadahmedev.base.controller.functional

import jakarta.annotation.Nonnull
import jakarta.annotation.Nullable
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@FunctionalInterface
interface BaseUpdateController<I, D> {

    @Nonnull
    @PutMapping("{id}")
    fun update(@PathVariable("id") id: I, @Nullable @RequestBody body: D): ResponseEntity<*>
}