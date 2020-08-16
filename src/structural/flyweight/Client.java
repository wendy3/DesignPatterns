package structural.flyweight;

/**
 * @author gww
 * @date 2020/08/16
 */
public class Client {
    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("aa");
        flyweight.operation("AA");
        flyweight = FlyweightFactory.getFlyweight("aa");
        flyweight.operation("BB");
    }
}
