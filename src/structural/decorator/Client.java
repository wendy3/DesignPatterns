package structural.decorator;

public class Client {
    public static void main(String[] args) {
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecorator decorator = new ConcreteDecorator(component);
        decorator.sampleOperation();
    }
}
