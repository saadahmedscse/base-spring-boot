package com.saadahmedev.base.controller.functional

import jakarta.annotation.Nonnull
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FunctionalInterface
interface BaseFindController<I> {

    @Nonnull
    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: I): ResponseEntity<*>
}