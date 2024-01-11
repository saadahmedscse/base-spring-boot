package com.saadahmedev.base.validator.functional

import com.saadahmedev.base.exception.exception.ApiException
import jakarta.annotation.Nullable
import kotlin.jvm.Throws

@FunctionalInterface
interface UpdateRequestValidator<I, D> {

    @Throws(ApiException::class)
    fun validateUpdateRequest(id: I, @Nullable body: D)
}