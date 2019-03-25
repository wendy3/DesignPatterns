package creational.factory.factoryMethod;

/**
 * 工厂具体类，用于创建产品A
 */
public class FactoryA implements Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
