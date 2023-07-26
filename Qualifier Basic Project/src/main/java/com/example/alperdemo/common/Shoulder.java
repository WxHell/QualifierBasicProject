package com.example.alperdemo.common;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
@Lazy
@Component
public class Shoulder implements Gym{
    public Shoulder(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "Renegade Row.\n" +
                "Standing Dumbbell Fly.\n" +
                "Face Pull.\n" +
                "High Pull.\n" +
                "Seated Dumbbell Clean.\n" +
                "Trap Raise.\n" +
                "Clean and Press.\n" +
                "Snatch-Grip High Pull.";
    }
}
