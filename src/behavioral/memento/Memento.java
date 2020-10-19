package behavioral.memento;

/**
 * 备忘录
 * 负责存储 Originator 对象的内部状态，并可防止 Originator 以外的其他对象访问备忘录
 * 在需要的时候提供发起人需要的内部状态
 * @author gww
 * @date 2020/09/13
 */
public class Memento {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento(String state) {
        this.state = state;
    }
}
