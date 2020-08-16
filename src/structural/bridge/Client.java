package structural.bridge;

/**
 * @author gww
 * @date 2020/08/16
 */
public class Client {
    public static void main(String[] args) {
        Abstraction ab = new RefinedAbstractionA();
        Implementor impl = new ConcreteImplementorB();
        ab.setImpl(impl);
        ab.operation();
    }
}
