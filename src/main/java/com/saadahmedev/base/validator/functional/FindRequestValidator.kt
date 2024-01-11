package com.saadahmedev.base.validator.functional

import com.saadahmedev.base.exception.ApiException
import kotlin.jvm.Throws

@FunctionalInterface
interface FindRequestValidator<ID> {

    @Throws(ApiException::class)
    fun validateFindRequest(id: ID)
}