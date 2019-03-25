package behavioral.command;

/**
 * @author gongw
 * @date 2019/3/7
 */
public class Client {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Invoker invoker = new Invoker();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        invoker.setCommand(concreteCommand);
        invoker.call();
    }
}
