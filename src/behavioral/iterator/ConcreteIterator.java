package behavioral.iterator;

import java.util.List;

/**
 * 某个具体迭代类
 * @author gww
 * @date 2020/09/13
 */
public class ConcreteIterator implements Iterator {
    private Aggregate aggregate = null;
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        super();
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        if (index >= aggregate.getSize()) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Object next() {
        Object o = aggregate.get(index);
        index++;
        return o;
    }
}
