package creational.factory.abstractFactory;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class Client {
    public static void main(String[] args) {
        FactoryA factoryA = new FactoryA();
        factoryA.createOne();
        factoryA.createTwo();
        FactoryB factoryB = new FactoryB();
        factoryB.createOne();
        factoryB.createTwo();
    }
}
