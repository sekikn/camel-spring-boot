/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.kamelet.springboot;

import org.apache.camel.Exchange;
import org.apache.camel.RoutesBuilder;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;
import org.apache.camel.ConsumerTemplate;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.apache.camel.test.spring.junit5.CamelSpringBootTest;
import org.apache.camel.spring.boot.CamelAutoConfiguration;


@DirtiesContext
@CamelSpringBootTest
@SpringBootTest(
    classes = {
        CamelAutoConfiguration.class,
        KameletConsumeOnlyTest.class,
    }
)

public class KameletConsumeOnlyTest {

    @Autowired
    ConsumerTemplate consumer;

    @Test
    public void canConsumeFromKamelet() {
        assertThat(
                consumer.receiveBody("kamelet:tick", Integer.class)).isEqualTo(1);
    }

    // **********************************************
    //
    // test set-up
    //
    // **********************************************

    @Bean
    protected RoutesBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                routeTemplate("tick")
                        .from("timer:{{routeId}}?repeatCount=1&delay=-1")
                        .setBody().exchangeProperty(Exchange.TIMER_COUNTER)
                        .to("kamelet:sink");
            }
        };
    }
}