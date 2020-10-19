package behavioral.memento;

/**
 * 发起人
 * 负责创建一个备忘录，用于记录当前时刻备忘录的内部状态，并可使用备忘录恢复内部状态。
 * 记录当前时刻的内部状态，并负责创建和恢复备忘录数据，允许访问返回到先前状态所需的所有数据。
 * @author gww
 * @date 2020/09/13
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setMemento(Memento memento) {
        this.state = memento.getState();
    }

    public Memento createMemento() {
        return new Memento(state);
    }

    public void show() {
        System.out.println("state: " + state);
    }
}
