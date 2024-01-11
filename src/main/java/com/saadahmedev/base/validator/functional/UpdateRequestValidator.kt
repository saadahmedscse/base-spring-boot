package com.saadahmedev.base.validator.functional

import com.saadahmedev.base.exception.ApiException
import jakarta.annotation.Nullable
import kotlin.jvm.Throws

@FunctionalInterface
interface UpdateRequestValidator<ID, DTO> {

    @Throws(ApiException::class)
    fun validateUpdateRequest(id: ID, @Nullable body: DTO)
}