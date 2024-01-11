package com.saadahmedev.base.validator

import com.saadahmedev.base.validator.functional.CreateRequestValidator
import com.saadahmedev.base.validator.functional.FindRequestValidator
import com.saadahmedev.base.validator.functional.UpdateRequestValidator

abstract class RequestValidator<ID, DTO> : CreateRequestValidator<DTO>, UpdateRequestValidator<ID, DTO>,
    FindRequestValidator<ID>