package behavioral.mediator;

/**
 * @author gww
 * @date 2020/09/13
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void scheduleMethod1() {
        super.colleague1.showMethod();
    }

    @Override
    public void scheduleMethod2() {
        super.colleague2.showMethod();
    }
}
