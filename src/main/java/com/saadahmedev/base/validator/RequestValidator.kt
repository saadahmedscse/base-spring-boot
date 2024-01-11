package com.saadahmedev.base.validator

import com.saadahmedev.base.validator.functional.CreateRequestValidator
import com.saadahmedev.base.validator.functional.FindRequestValidator
import com.saadahmedev.base.validator.functional.UpdateRequestValidator

abstract class RequestValidator<I, D> : CreateRequestValidator<D>, UpdateRequestValidator<I, D>,
    FindRequestValidator<I>