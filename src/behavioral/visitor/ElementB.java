package behavioral.visitor;

/**
 * @author gww
 * @date 2020/09/06
 */
public class ElementB implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
