package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义当中所提到的对象结构，对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素提供访问者访问。
 * @author gww
 * @date 2020/09/06
 */
public class ObjectStructure {
    private List<Element> elements = new ArrayList<>();

    public void accept(Visitor visitor) {
        // 这里可以具体编写被访问对象的访问规则
        for (Element element : elements) {
            element.accept(visitor);
        }
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public void removeElement(Element element) {
        elements.remove(element);
    }
}
