package behavioral.visitor;

/**
 * @author gww
 * @date 2020/09/06
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure structure = new ObjectStructure();
        structure.addElement(new ElementA());
        structure.addElement(new ElementB());

        structure.accept(new VisitorA());
        structure.accept(new VisitorB());
    }
}
