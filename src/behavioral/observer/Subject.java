package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {
    private List<Observer> os = new ArrayList<>(10);
    void attach(Observer o) {
        os.add(o);
    }

    void detach(Observer o) {
        os.remove(o);
    }

    void notifyAllObserver() {
        for (Observer o : os) {
            o.update();
        }
    }

    public abstract void notify(Object o);
}
