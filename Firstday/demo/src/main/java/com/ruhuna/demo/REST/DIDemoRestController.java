package com.ruhuna.demo.REST;

import com.ruhuna.demo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DIDemoRestController {
    private Coach coach;

    @Autowired
    public DIDemoRestController(Coach coach) {
        this.coach = coach;
    }
}
