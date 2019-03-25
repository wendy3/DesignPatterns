package structural.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("收到一个请求！！");
    }
}
