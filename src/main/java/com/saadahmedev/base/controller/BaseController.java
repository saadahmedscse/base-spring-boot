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

package com.saadahmedev.base.controller;

import com.saadahmedev.base.controller.functional.*;
import com.saadahmedev.base.exception.thrower.ExceptionThrower;

/**
 * Abstract base class providing common functionality for controller operations.
 *
 * @param <I> The type representing the identifier for entities.
 * @param <D> The type representing the request body for DTOs.
 */
public abstract class BaseController<I, D> extends ExceptionThrower implements CreateController<D>, UpdateController<I, D>, FindController<I>, FindAllController, DeleteController<I> {
}