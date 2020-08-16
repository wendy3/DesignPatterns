package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 组合节点
 *
 * @author gww
 * @date 2020/08/16
 */
public class Composite extends Component {
    private List<Component> childComponents = null;

    @Override
    public void someOperation() {
        System.out.println("i am composite");
    }

    @Override
    public void addChild(Component component) {
        if (childComponents == null) {
            childComponents = new ArrayList();
        }
        childComponents.add(component);
    }

    @Override
    public void removeChild(Component component) {
        if (childComponents == null) {
            childComponents.remove(component);
        }
    }

    @Override
    public Component getChild(int index) {
        if (childComponents != null) {
            if (index >= 0 && index < childComponents.size()) {
                return childComponents.get(index);
            }
        }
        return null;
    }
}
