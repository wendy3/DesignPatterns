package behavioral.strategy;

public class ConcreteClassStrategyA implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("A plan run.");
    }
}
