package behavioral.iterator;

/**
 * 聚集抽象类
 * @author gww
 * @date 2020/09/13
 */
public interface Aggregate {
    void add(Object o);
    Object get(int index);
    Iterator iterator();
    int getSize();
}
