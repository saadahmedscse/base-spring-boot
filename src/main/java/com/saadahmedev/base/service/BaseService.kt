package com.saadahmedev.base.service

import com.saadahmedev.base.exception.thrower.ExceptionThrower
import com.saadahmedev.base.service.functional.*

abstract class BaseService<I, D> : ExceptionThrower(), BaseCreateService<D>, BaseUpdateService<I, D>,
    BaseFindService<I>, BaseFindAllService, BaseDeleteService<I>