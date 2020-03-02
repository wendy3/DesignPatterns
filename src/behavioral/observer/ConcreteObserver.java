package behavioral.observer;

public class ConcreteObserver extends Observer {
    @Override
    public void update() {
        System.out.println("更新一条信息！");
    }
}
