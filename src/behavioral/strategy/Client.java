package behavioral.strategy;

/**
 * @author gongw
 * @date 2019/3/7
 */
public class Client {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteClassStrategyA());
        context.contextInterface();
    }
}
