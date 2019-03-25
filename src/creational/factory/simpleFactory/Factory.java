package creational.factory.simpleFactory;

/**
 * 工厂类，用于创建产品
 */
public class Factory {
    public static Product create(String type) {
        if ("ProductOneA".equalsIgnoreCase(type)) {
            return new ProductA();
        } else if ("ProductOneB".equalsIgnoreCase(type)) {
            return new ProductB();
        } else {
            throw new RuntimeException("找不到相应的产品，无法创建！");
        }
    }
}
