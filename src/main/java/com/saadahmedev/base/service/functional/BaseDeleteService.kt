package com.saadahmedev.base.service.functional

import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseDeleteService<I> {

    fun delete(id: I): ResponseEntity<*>
}