package com.lulucode.restfulApi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Router {

    @GetMapping("/greeting")
    public String greeting() {
        return "Greetings from LuluCode!";
    }

}
