package behavioral.memento;

/**
 * @author gww
 * @date 2020/09/13
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("On");
        originator.show();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());
        originator.setState("Off");
        originator.show();
        originator.setMemento(caretaker.getMemento());
        originator.show();
    }
}
