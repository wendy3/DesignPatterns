package creational.factory.abstractFactory;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class FactoryB implements Factory {
    @Override
    public ProductOne createOne() {
        return new ProductOneB();
    }

    @Override
    public ProductTwo createTwo() {
        return new ProductTwoB();
    }
}
