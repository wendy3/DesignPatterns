package structural.bridge;

/**
 * @author gww
 * @date 2020/08/16
 */
public abstract class Abstraction {
    protected Implementor impl;

    public void setImpl(Implementor impl) {
        this.impl = impl;
    }

    public abstract void operation();
}
