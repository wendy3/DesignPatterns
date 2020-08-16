package structural.flyweight;

/**
 * 具体享元对象
 *
 * @author gww
 * @date 2020/08/16
 */
public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {
        System.out.println("具体实现: "+intrinsicState+","+extrinsicState);
    }
}
