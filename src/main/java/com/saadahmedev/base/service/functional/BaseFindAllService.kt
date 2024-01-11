package com.saadahmedev.base.service.functional

import org.springframework.http.ResponseEntity

@FunctionalInterface
interface BaseFindAllService {

    fun findAll(): ResponseEntity<List<*>>
}