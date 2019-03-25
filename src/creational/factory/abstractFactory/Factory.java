package creational.factory.abstractFactory;

import creational.factory.simpleFactory.Product;

public interface Factory {
    // 创建产品A
    public Product createA();

    // 创建产品B
    public Product createB();
}
