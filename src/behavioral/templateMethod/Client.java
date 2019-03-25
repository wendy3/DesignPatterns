package behavioral.templateMethod;

/**
 * @author gongw
 * @date 2019/3/7
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();
        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
