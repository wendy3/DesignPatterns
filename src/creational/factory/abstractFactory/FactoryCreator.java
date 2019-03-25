package creational.factory.abstractFactory;

import creational.factory.simpleFactory.Product;
import creational.factory.simpleFactory.ProductA;
import creational.factory.simpleFactory.ProductB;

/**
 * 工厂创建类
 */
public class FactoryCreator implements Factory {
    @Override
    public Product createA() {
        return new ProductA();
    }

    @Override
    public Product createB() {
        return new ProductB();
    }
}
