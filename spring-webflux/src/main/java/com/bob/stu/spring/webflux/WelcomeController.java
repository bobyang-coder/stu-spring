package com.bob.stu.spring.webflux;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO 又忘写注释啦!!!
 *
 * @author haibo.yang
 * @since 26 七月 2018
 */
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Hello World!";
    }

}
