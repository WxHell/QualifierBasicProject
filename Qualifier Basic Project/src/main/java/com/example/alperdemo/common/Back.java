package com.example.alperdemo.common;

import org.springframework.stereotype.Component;

@Component
public class Back implements Gym{
    public Back(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String getWorkout() {
        return"Kettlebell Swings\n" +
                "Barbell Deadlift\n" +
                "Barbell Bent-over Row\n" +
                "Pull-up\n" +
                "Dumbbell Single-arm Row\n" +
                "Chest-supported Dumbbell Row\n" +
                "Inverted Row\n" +
                "Lat Pulldown\n" +
                "Single-arm T-bar Rows\n" +
                "Farmer's Walk\n" +
                "Renegade Row\n" +
                "Superman\n" +
                "TRX Low Row\n" +
                "Med Ball Wood Chop\n" +
                "Good Mornings\n" +
                "Landmine T-bar Row\n" +
                "Pendlay Row\n" +
                "Chainsaw Row\n" +
                "Scapula Shrugs\n" +
                "Seated Row\n" ;
    }
}
