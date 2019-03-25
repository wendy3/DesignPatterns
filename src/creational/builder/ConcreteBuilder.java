package creational.builder;

public class ConcreteBuilder implements Builder {

    Product product;

    public ConcreteBuilder() {
        this.product = new Product();
    }

    @Override
    public void buildPartOne() {
        product.setPartOne("生成第一部分");
    }

    @Override
    public void buildPartTwo() {
        product.setPartTwo("生成第二部分");
    }

    @Override
    public Product buildProduct() {
        return this.product;
    }

    @Override
    public String toString() {
        return "ConcreteBuilder{" +
                "product=" + product +
                '}';
    }
}
