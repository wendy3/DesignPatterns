package creational.factory.factoryMethod;

/**
 * 工厂具体类，用于创建产品B
 */
public class FactoryB implements Factory {
    @Override
    public Product create() {
        return new ProductB();
    }
}
