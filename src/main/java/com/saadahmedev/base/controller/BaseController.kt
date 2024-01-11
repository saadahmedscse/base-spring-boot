package com.saadahmedev.base.controller

import com.saadahmedev.base.controller.functional.*
import com.saadahmedev.base.exception.thrower.ExceptionThrower
import jakarta.servlet.http.HttpServletRequest

abstract class BaseController<I, D> : ExceptionThrower(), BaseCreateController<D>, BaseUpdateController<I, D>,
    BaseFindController<I>, BaseFindAllController, BaseDeleteController<I>