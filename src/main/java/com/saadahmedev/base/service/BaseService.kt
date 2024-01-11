package com.saadahmedev.base.service

import com.saadahmedev.base.service.functional.*

abstract class BaseService<I, D> : BaseCreateService<D>, BaseUpdateService<I, D>, BaseFindService<I>,
    BaseFindAllService, BaseDeleteService<I>