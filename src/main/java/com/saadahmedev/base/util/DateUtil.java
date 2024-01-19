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

package com.saadahmedev.base.util;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;

import java.util.Date;

/**
 * Date Utility Class
 *
 * <p>
 * This utility class provides methods to work with date and time operations.
 * </p>
 *
 * @author <a href="https://github.com/saadahmedscse">Saad Ahmed</a>
 */
public class DateUtil {

    /**
     * Gets the current instant as a string.
     *
     * @return A string representation of the current instant.
     */
    @Nonnull
    public static String getInstant() {
        return new Date().toInstant().toString();
    }

    /**
     * Gets the instant of the specified date as a string.
     *
     * @param date The date for which to obtain the instant.
     * @return A string representation of the instant of the specified date.
     */
    @Nullable
    public static String getInstant(@Nullable Date date) {
        return date != null ? date.toInstant().toString() : null;
    }

    /**
     * Gets the instant of the specified time as a string.
     *
     * @param time The time in milliseconds since the epoch.
     * @return A string representation of the instant of the specified time.
     */
    @Nullable
    public static String getInstant(@Nullable Long time) {
        return time != null ? new Date(time).toInstant().toString() : null;
    }
}

