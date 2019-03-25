package behavioral.command;

/**
 * @author gongw
 * @date 2019/3/7
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void call() {
        command.execute();
    }
}
