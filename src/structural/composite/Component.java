package structural.composite;

/**
 * 抽象组件类
 * 使得叶子节点和组合节点形成一致性
 *
 * @author gww
 * @date 2020/08/16
 */
public abstract class Component {
    public abstract void someOperation();

    public void addChild(Component component) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    public void removeChild(Component component) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }

    public Component getChild(int index) {
        throw new UnsupportedOperationException("对象不支持这个功能！");
    }
}
