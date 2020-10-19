package behavioral.iterator;

/**
 * @author gww
 * @date 2020/09/13
 */
public class Client {
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("a");
        aggregate.add("b");
        aggregate.add("c");
        aggregate.add("d");
        Iterator iterator = aggregate.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
