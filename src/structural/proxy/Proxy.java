package structural.proxy;

/**
 * 静态代理
 * 像这样子的硬编码，需要经过编译器编译成class文件的，称之为静态代理
 */
public class Proxy implements Subject {

    // 持有一个被代理者的引用
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("代理执行之前");
        subject.request();
        System.out.println("代理执行之后");
    }
}
