package structural.adapter;

/**
 * 对象适配器
 */
public class Adapter2 implements Target {
    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // 使用委托方式
        adaptee.specificRequest();
    }
}
