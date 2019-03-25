package creational.factory.factoryMethod;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class Client {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.create();
        FactoryB factoryB = new FactoryB();
        factoryB.create();
    }
}
