package behavioral.iterator;

/**
 * 某个具体聚集类
 * @author gww
 * @date 2020/09/13
 */
public class ConcreteAggregate implements Aggregate {
    private Object[] obs;
    private int size = 0;
    private int index = 0;

    public ConcreteAggregate() {
        this.size = 0;
        this.index = 0;
        this.obs = new Object[100];
    }

    @Override
    public void add(Object o) {
        this.obs[this.index++] = o;
        this.size++;
    }

    @Override
    public Object get(int index) {
        return this.obs[index];
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public int getSize() {
        return this.size;
    }
}
