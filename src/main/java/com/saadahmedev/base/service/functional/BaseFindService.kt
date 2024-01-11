package com.saadahmedev.base.service.functional

import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseFindService<I> {

    fun findById(id: I): ResponseEntity<*>
}