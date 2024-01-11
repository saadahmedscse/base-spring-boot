package com.saadahmedev.base.controller.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PathVariable

@FunctionalInterface
interface BaseDeleteController<ID> {

    @Nonnull
    @DeleteMapping("{id}")
    fun delete(@PathVariable("id") id: ID): ResponseEntity<*>
}