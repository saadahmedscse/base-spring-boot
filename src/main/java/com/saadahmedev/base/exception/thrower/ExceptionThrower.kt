package com.saadahmedev.base.exception.thrower

import com.saadahmedev.base.exception.exception.ApiException
import com.saadahmedev.base.exception.exception.BadRequestException
import java.lang.Exception

abstract class ExceptionThrower {
    fun required(field: String): BadRequestException = BadRequestException(message = "$field is required")

    fun message(message: String): BadRequestException = BadRequestException(message = message)

    fun exception(exception: Exception): ApiException = ApiException(exception = exception)
}