package com.saadahmedev.base.exception.exception

import java.lang.Exception

class BadRequestException : RuntimeException {

    constructor() : super()

    constructor(message: String) : super(message)

    constructor(message: String, cause: Throwable) : super(message, cause)

    constructor(cause: Throwable) : super(cause)

    constructor(exception: Exception) : super(exception.message ?: "Unexpected error occurred")
}