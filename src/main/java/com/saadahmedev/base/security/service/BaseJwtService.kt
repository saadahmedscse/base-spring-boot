/*
 * Copyright 2018-2024 Saad Ahmed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.saadahmedev.base.security.service

import io.jsonwebtoken.Claims
import java.io.Serializable
import java.security.Key
import java.util.*
import kotlin.collections.HashMap

abstract class BaseJwtService<I : Serializable> {

    fun isExpired(token: String): Boolean = getExpirationDateFromToken(token).before(Date())

    fun getId(token: String, clazz: Class<I>): I = getClaimsFromToken(token).get("id", clazz)

    fun getRole(token: String): String = getClaimsFromToken(token).get("role", String::class.java)

    fun getUsername(token: String): String = getClaimFromToken(token, Claims::getSubject)

    fun generateAccessToken(username: String): String = generateAccessToken(HashMap(), username)

    protected abstract fun setupClaims(claims: Map<String, Any>, username: String)

    protected abstract fun generateAccessToken(claims: Map<String, Any>, username: String): String

    protected abstract fun getClaimsFromToken(token: String): Claims

    private fun <T> getClaimFromToken(token: String, claimResolver: (Claims) -> T): T = claimResolver.invoke(getClaimsFromToken(token))

    private fun getExpirationDateFromToken(token: String): Date = getClaimFromToken(token, Claims::getExpiration)

    protected abstract fun getSigningKey(): Key
}