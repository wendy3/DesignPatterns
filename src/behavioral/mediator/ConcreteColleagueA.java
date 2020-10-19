package behavioral.mediator;

/**
 * @author gww
 * @date 2020/09/13
 */
public class ConcreteColleagueA extends Colleague {
    public ConcreteColleagueA(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod() {
        System.out.println("do self something");
    }

    public void showMethod() {
        System.out.println("send to B");
    }

    public void dependencyMethod() {
        super.mediator.scheduleMethod2();
    }
}
