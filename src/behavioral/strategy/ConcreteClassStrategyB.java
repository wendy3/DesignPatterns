package behavioral.strategy;

public class ConcreteClassStrategyB implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("B plan run.");
    }
}
