package com.ruhuna.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class BasketBallCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Run 20 mins continously";
    }
}
