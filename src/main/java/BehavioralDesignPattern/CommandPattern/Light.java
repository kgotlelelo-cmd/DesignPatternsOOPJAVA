package BehavioralDesignPattern.CommandPattern;


//receiver

public class Light {

    public void turnOn(){
        System.out.println("Lights are on...");
    }

    public void turnOff(){
        System.out.println("Light are off...");
    }
}
