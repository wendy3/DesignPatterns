package behavioral.visitor;

/**
 * 定义了一个接受访问者（accept）的方法，其意义是指每一个元素都要可以被访问者访问。
 * @author gww
 * @date 2020/09/06
 */
public interface Element {
    void accept(Visitor visitor);
}
