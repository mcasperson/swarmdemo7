package com.matthewcasperson.swarmdemo;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;

/**
 * A camel route that uses our CDI bean
 */
class MyRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("servlet:hello").to("bean:myBean").process(new Processor() {

            @Override
            public void process(Exchange exchange) throws Exception {

            }
        });
    }
}