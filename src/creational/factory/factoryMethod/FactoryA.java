package creational.factory.factoryMethod;

import creational.factory.simpleFactory.Product;
import creational.factory.simpleFactory.ProductA;

/**
 * 工厂具体类，用于创建产品A
 */
public class FactoryA implements Factory {
    @Override
    public Product create() {
        return new ProductA();
    }
}
