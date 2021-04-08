package BehavioralDesignPattern.StrategyPattern;

public class Manager implements Strategy {

    Strategy strategy;

    public Manager(Strategy strategy){
        this.strategy = strategy;
    }

    @Override
    public void operation(int a, int b) {
        this.strategy.operation(a, b);
    }

}
