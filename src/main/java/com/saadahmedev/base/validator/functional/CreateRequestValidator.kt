package com.saadahmedev.base.validator.functional

import com.saadahmedev.base.exception.exception.ApiException
import jakarta.annotation.Nullable
import kotlin.jvm.Throws

@FunctionalInterface
interface CreateRequestValidator<D> {

    @Throws(ApiException::class)
    fun validateCreateRequest(@Nullable body: D)
}