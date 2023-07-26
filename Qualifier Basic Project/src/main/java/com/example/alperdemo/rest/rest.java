package com.example.alperdemo.rest;

import com.example.alperdemo.common.Gym;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class rest {
 private Gym chest;
 private Gym shoulder;
 private Gym arm;
 private Gym back;
 private Gym leg;


 @Autowired
  public void chestDay(@Qualifier("chest")Gym Chest){
   chest=Chest;
 }
 @Autowired
  public void shoulderDay(@Qualifier("shoulder")Gym Shoulder){
   shoulder=Shoulder;
 }
 @Autowired
  public void armDay(@Qualifier("arm") Gym Arm){
   arm=Arm;
 }
 @Autowired
  public void backDay(@Qualifier("back")Gym Back){
   back=Back;
 }
 @Autowired
  public void legDay(@Qualifier("leg")Gym Leg){
   leg=Leg;
 }

 @GetMapping("/shoulder")
  public String Shoulder(){
   return  shoulder.getWorkout();
 }
@GetMapping("/back")
  public  String Back(){
   return back.getWorkout();
}
 @GetMapping("/chest")
  public String Chest(){
   return chest.getWorkout();
 }
 @GetMapping("/leg")
   public String Leg(){
     return leg.getWorkout();
 }
@GetMapping("/arm")
  public String Arm(){
   return arm.getWorkout();
}
}
