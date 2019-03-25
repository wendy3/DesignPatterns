package creational.prototype;

/**
 * 浅拷贝
 * 如果是深拷贝，则需要把类中的属性也复制一份新的。
 */
public class Prototype implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
