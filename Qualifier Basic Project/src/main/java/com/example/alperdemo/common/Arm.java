package com.example.alperdemo.common;

import org.springframework.stereotype.Component;

@Component
public class Arm implements Gym{
    public Arm(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return "1. BARBELL BICEPS CURLS" +
                "2. CABLE TRICEPS EXTENSION" +
                "3. DUMBBELL HAMMER CURLS" +
                "4. BENCH DUMBBELL TRICEPS EXTENSIONS" +
                "5. CABLE BICEPS CURLS WITH SHOULDER FLEXED" +
                "6. CABLE TRICEPS EXTENSION WITH SHOULDER FLEXED" +
                "7. WRIST FLEXION" +
                "8. WRIST EXTENSION";
    }
}
