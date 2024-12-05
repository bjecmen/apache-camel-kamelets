package com.bits.camel.example;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class BitsLogCommonMessageExampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("timer:log-timer?repeatCount=1")
            .log("${routeId}")
            .to("kamelet:logCommonMessage?messageType=Tralala a lalala")
            .log("${body}")
            .to("kamelet:logCommonMessage?messageType=Bobo je frajer&httpStatusCode=200&messageDebugLevel=5&processStatusCode=S")
            .log("${body}");
    }
}
