package behavioral.visitor;

/**
 * @author gww
 * @date 2020/09/06
 */
public class VisitorB implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println(elementA.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问！");
    }

    @Override
    public void visit(ElementB elementB) {
        System.out.println(elementB.getClass().getSimpleName() + "被" + this.getClass().getSimpleName() + "访问！");
    }
}
