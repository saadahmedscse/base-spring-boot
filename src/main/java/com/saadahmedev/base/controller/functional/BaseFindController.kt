package com.saadahmedev.base.controller.functional

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable

@FunctionalInterface
interface BaseFindController<ID> {

    @GetMapping("{id}")
    fun findById(@PathVariable("id") id: ID): ResponseEntity<*>
}