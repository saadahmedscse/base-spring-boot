package com.saadahmedev.base.service.functional

import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseUpdateService<I, D> {

    fun update(id: I, body: D): ResponseEntity<*>
}