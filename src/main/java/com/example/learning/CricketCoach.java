package com.example.learning;


import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice bowling 15 min!!!!";
    }
}
