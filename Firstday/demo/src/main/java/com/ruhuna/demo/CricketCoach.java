package com.ruhuna.demo;


import org.springframework.stereotype.Component;

@Component
//we can say cricket coach is a type of coach
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice batting for one hour";
    }
}
