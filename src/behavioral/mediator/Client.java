package behavioral.mediator;

/**
 * @author gww
 * @date 2020/09/13
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleagueA colleague1 = new ConcreteColleagueA(mediator);
        ConcreteColleagueB colleague2 = new ConcreteColleagueB(mediator);

        mediator.setColleague1(colleague1);
        mediator.setColleague2(colleague2);

        colleague1.selfMethod();
        colleague1.dependencyMethod();

        colleague2.selfMethod();
        colleague2.dependencyMethod();
    }
}
