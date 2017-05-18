/*
 *  Copyright (c) 2017 Kamesh Sampath<kamesh.sampath@hotmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.workspace7.moviestore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author kameshs
 */
@SpringBootApplication(exclude = {org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration.class})
@EnableAutoConfiguration
public class MyMovieStoreApp extends SpringBootServletInitializer {

    public static void main(String... args) {
        SpringApplication.run(MyMovieStoreApp.class, args);
    }

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MyMovieStoreApp.class);
    }
}
