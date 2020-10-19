package behavioral.mediator;

/**
 * @author gww
 * @date 2020/09/13
 */
public class ConcreteColleagueB extends Colleague {
    public ConcreteColleagueB(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod() {
        System.out.println("do self something");
    }

    public void showMethod() {
        System.out.println("send to A");
    }

    public void dependencyMethod() {
        super.mediator.scheduleMethod1();
    }
}
