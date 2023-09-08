package com.ruhuna.demo;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Qualifier
//@Primary

//we can say cricket coach is a type of coach
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice batting for one hour";
    }
}
