package behavioral.observer;

import java.util.List;

public class ConcreteSubject extends Subject {
    @Override
    public void notify(Object o) {
        if (o instanceof String) {
            System.out.println("通知" + o);
        } else if (o instanceof List) {
            for (Object i:(List) o) {
                System.out.println(i+"\n");
            }
        }
    }
}
