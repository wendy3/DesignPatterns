package creational.builder;

/**
 * @author gongw
 * @date 2019/3/7
 */
public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        director.create(concreteBuilder);

        System.out.println(concreteBuilder.toString());
    }
}
