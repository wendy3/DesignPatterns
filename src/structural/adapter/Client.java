package structural.adapter;

/**
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        ConcreteTarget target = new ConcreteTarget();
        target.request();

        // 类适配器模式
        Adapter adapter = new Adapter();
        adapter.request();

        // 对象适配器模式
        Adapter2 adapter2 = new Adapter2(new Adaptee());
        adapter2.request();
    }
}
