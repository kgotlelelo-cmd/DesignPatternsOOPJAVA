package BehavioralDesignPattern.StrategyPattern;

public class StrategyMain {

    public static void main(String[] args) {

        Strategy manager = new Manager(new Multiply());
        manager.operation(1,2);
    }
}
