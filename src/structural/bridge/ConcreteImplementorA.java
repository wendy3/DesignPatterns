package structural.bridge;

/**
 * @author gww
 * @date 2020/08/16
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("实现ImplA");
    }
}
