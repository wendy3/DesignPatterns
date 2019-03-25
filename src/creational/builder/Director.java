package creational.builder;

public class Director {
    public Product create(Builder builder) {
        builder.buildPartOne();
        builder.buildPartTwo();
        return builder.buildProduct();
    }
}
