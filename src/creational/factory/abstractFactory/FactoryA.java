package creational.factory.abstractFactory;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class FactoryA implements Factory {
    @Override
    public ProductOne createOne() {
        return new ProductOneA();
    }

    @Override
    public ProductTwo createTwo() {
        return new ProductTwoA();
    }
}
