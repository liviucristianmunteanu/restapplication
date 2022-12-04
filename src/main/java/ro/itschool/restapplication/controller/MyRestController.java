package ro.itschool.restapplication.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {

    @GetMapping(value="/get-example")
    public String sayHello() {
        return "Hello World!";
    }
}
