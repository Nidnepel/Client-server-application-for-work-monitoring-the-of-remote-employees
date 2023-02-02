package ru.lependin.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/hello-world")
    public String SayHello() {
        return "hello_world";
    }
}
