package behavioral.state;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class ConcreteStateC extends State {
    @Override
    public void handle(Context context) {
        System.out.println("当前执行C状态过程");
        context.setState(new ConcreteStateA());
    }
}
