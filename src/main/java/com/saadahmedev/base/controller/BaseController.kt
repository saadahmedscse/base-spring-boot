package com.saadahmedev.base.controller

import com.saadahmedev.base.controller.functional.*
import com.saadahmedev.base.exception.thrower.ExceptionThrower
import jakarta.servlet.http.HttpServletRequest

abstract class BaseController<ID, DTO> : ExceptionThrower(), BaseCreateController<DTO>, BaseUpdateController<ID, DTO>,
    BaseFindController<ID>, BaseFindAllController, BaseDeleteController<ID>