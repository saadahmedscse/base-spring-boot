package com.saadahmedev.base.util

import java.util.Date

object DateUtil {

    fun getInstant(time: Long): String = Date(time).toInstant().toString()
}