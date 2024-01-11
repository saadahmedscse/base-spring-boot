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

package com.saadahmedev.base.util

/**
 * Base Spring Boot
 * <p>
 * Constants object is for the const variables which can be used dynamically
 * <p>
 * Date: 01-12-2023
 *
 * @author Saad Ahmed
 * @since 2018
 * @see <a href="https://github.com/saadahmedscse/Android-Popup-Dialog">Android Popup Dialog</a>
 * @see <a href="https://github.com/saadahmedscse/TinyDB">Tiny DB Android</a>
 * @see <a href="https://github.com/saadahmedscse/ShortIntent">Android Short Intent</a>
 */

object Constants {

    object Server {

        object Message {

            const val INTERNAL_SERVER_ERROR = "Internal Server Error!"
            const val BAD_REQUEST = "Bad Request!"
            const val SUCCESS = "Success!"
            const val CREATED = "Created!"
            const val UNAUTHORIZED = "Unauthorized Access!"
            const val NOT_FOUND = "Endpoint Not Found!"
        }
    }
}