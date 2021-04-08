package BehavioralDesignPattern.CommandPattern;

public class CommandMain {

    public static void main(String[] args) {

        Switcher switcher = new Switcher();

        Light light = new Light();

        TurnOnCommand onCommand = new TurnOnCommand(light);

        TurnOffCommand offCommand = new TurnOffCommand(light);

        switcher.addCommand(onCommand);
        switcher.addCommand(offCommand);

        switcher.executeCommands();
    }
}
