package com.bob.stu.spring.webflux;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

/**
 * TODO 又忘写注释啦!!!
 *
 * @author haibo.yang
 * @since 26 七月 2018
 */
@Component
public class EchoHandler {

    public Mono<ServerResponse> echo(ServerRequest request) {
        return ServerResponse.ok().body(request.bodyToMono(String.class), String.class);
    }
}
