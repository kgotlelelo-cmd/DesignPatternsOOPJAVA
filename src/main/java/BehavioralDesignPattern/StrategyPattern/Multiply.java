package BehavioralDesignPattern.StrategyPattern;

public class Multiply implements Strategy{


    @Override
    public void operation(int a, int b) {
        System.out.println(a*b);
    }
}
