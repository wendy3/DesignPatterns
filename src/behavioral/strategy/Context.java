package behavioral.strategy;

/**
 * 环境类，即上下文
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void contextInterface() {
        strategy.doSomething();
    }
}
