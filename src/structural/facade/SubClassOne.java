package structural.facade;

/**
 * @author gongw
 * @date 2019/3/25
 */
public class SubClassOne implements Execute {
    @Override
    public void method() {
        System.out.println("Class One 执行了 A method");
    }
}
