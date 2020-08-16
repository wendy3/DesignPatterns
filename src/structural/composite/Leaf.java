package structural.composite;

/**
 * 叶子节点
 * @author gww
 * @date 2020/08/16
 */
public class Leaf extends Component {
    @Override
    public void someOperation() {
        System.out.println("i am leaf!");
    }
}
