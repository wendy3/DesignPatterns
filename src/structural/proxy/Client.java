package structural.proxy;

/**
 * @author gongw
 * @date 2019/3/7
 */
public class Client {
    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
