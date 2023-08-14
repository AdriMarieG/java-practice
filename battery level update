/*
This droid performs tasks that deplete and announce new batter level after every task.

Author: Adrianne
Date: 8-14-2023
*/

public class Droid{
  //instance variables
  String name;
  int batteryLevel;

  //constructor
  public Droid(String droidName){
    name = droidName;
    batteryLevel = 100;
  }
  
  //class methods
  public void performTask(String task){
    System.out.println(name +" is performing task(s): " + task);
    batteryLevel = batteryLevel - 10;
      System.out.println("Battery level is: " + batteryLevel);
    
  }

  public Droid(int shareBatteryLevel){

  }

  public String toString(){
    return "Hello! This droid's name is ' " + name + "!";
  }

  //main method
  public static void main(String[] args){

    Droid droid1 = new Droid("Codey");
    System.out.println(droid1);
    droid1.performTask("dancing");
    droid1.performTask("running a marathon");
    droid1.performTask("recovering from a 26.2 mile run");
    

    }
}
