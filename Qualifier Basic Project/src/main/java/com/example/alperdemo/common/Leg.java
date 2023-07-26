package com.example.alperdemo.common;

import org.springframework.stereotype.Component;

@Component
public class Leg implements Gym{
    public Leg(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "Back Squat.\n" +
                "Front Squat.\n" +
                "Bulgarian Split Squat.\n" +
                "Leg Press.\n" +
                "Hack Squat.\n" +
                "Romanian Deadlift.\n" +
                "Nordic Hamstring Curl.\n" +
                "Landmine Goblet Squat.";
    }
}
