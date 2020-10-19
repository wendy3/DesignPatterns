package behavioral.mediator;

/**
 * @author gww
 * @date 2020/09/13
 */
public abstract class Mediator {
    protected ConcreteColleagueA colleague1;
    protected ConcreteColleagueB colleague2;

    public ConcreteColleagueA getColleague1() {
        return colleague1;
    }

    public void setColleague1(ConcreteColleagueA colleague1) {
        this.colleague1 = colleague1;
    }

    public ConcreteColleagueB getColleague2() {
        return colleague2;
    }

    public void setColleague2(ConcreteColleagueB colleague2) {
        this.colleague2 = colleague2;
    }

    public abstract void scheduleMethod1();

    public abstract void scheduleMethod2();
}
