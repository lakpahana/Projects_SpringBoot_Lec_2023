package com.ruhuna.demo.REST;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
    @GetMapping(
            "/hello"
    )
    public String helloWorld(){
        return "Hello";
    }

}
