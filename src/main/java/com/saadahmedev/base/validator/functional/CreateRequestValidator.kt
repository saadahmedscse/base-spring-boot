package com.saadahmedev.base.validator.functional

import com.saadahmedev.base.exception.ApiException
import jakarta.annotation.Nullable
import kotlin.jvm.Throws

@FunctionalInterface
interface CreateRequestValidator<DTO> {

    @Throws(ApiException::class)
    fun validateCreateRequest(@Nullable body: DTO)
}