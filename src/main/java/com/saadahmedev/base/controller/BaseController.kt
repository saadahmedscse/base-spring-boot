package com.saadahmedev.base.controller

import com.saadahmedev.base.controller.functional.*
import jakarta.servlet.http.HttpServletRequest

abstract class BaseController<ID, DTO> : BaseCreateController<DTO>, BaseUpdateController<ID, DTO>,
    BaseFindController<ID>, BaseFindAllController, BaseDeleteController<ID>