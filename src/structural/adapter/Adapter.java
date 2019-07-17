package structural.adapter;

/**
 * 类适配器，继承被适配类，同时实现标准接口
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
