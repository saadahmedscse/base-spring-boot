package com.saadahmedev.base.validator.functional

import com.saadahmedev.base.exception.exception.ApiException
import kotlin.jvm.Throws

@FunctionalInterface
interface FindRequestValidator<D> {

    @Throws(ApiException::class)
    fun validateFindRequest(id: D)
}