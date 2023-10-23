package it.digitalnucleus.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${greetings.message}")
    private String hello;

    @Value("${greetings.fortune}")
    private String fortune;

    // Expose "/" that returns the greetings message.
    @GetMapping("/")
    public String sayHello() {
        return hello;
    }

    @GetMapping("/fortune")
    public String getFortune() {
        return fortune;
    }

}
