package behavioral.state;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.request();
        context.request();
        context.request();
    }
}
