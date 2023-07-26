package com.example.alperdemo.common;

import org.springframework.stereotype.Component;

@Component
public class Chest implements Gym{
    public Chest(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "1. Incline push up" +
                "2. Flat bench press\n" +
                "3. Incline bench press" +
                "4. Decline bench press" +
                "5. Pushup" +
                "6. Cable crossover" +
                "7. Chest dip" +
                "8. Resistance band pullover";
    }
}
