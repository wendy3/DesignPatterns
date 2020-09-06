package behavioral.visitor;

/**
 * 定义了对每个 Element 访问的行为，它的参数就是被访问的元素，它的方法个数理论上与元素的个数是一样的，
 * 因此，访问者模式要求元素的类型要稳定，如果经常添加、移除元素类，必然会导致频繁地修改 Visitor 接口，
 * 如果出现这种情况，则说明不适合使用访问者模式。
 * @author gww
 * @date 2020/09/06
 */
public interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
}
