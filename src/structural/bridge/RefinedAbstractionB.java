package structural.bridge;

/**
 * @author gww
 * @date 2020/08/16
 */
public class RefinedAbstractionB extends Abstraction {
    @Override
    public void operation() {
        System.out.println("实现了扩展部分B");
        impl.operationImpl();
    }
}
