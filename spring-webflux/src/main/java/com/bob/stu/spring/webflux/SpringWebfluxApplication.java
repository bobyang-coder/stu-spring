package com.bob.stu.spring.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class SpringWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebfluxApplication.class, args);
	}

	@Bean
	public RouterFunction<ServerResponse> monoRouterFunction(EchoHandler echoHandler) {
		return route(POST("/echo"), echoHandler::echo);
	}
}
