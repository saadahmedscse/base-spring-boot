package com.saadahmedev.base.controller.functional

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping

@FunctionalInterface
interface BaseFindAllController {

    @GetMapping
    fun findAll(): ResponseEntity<List<*>>
}