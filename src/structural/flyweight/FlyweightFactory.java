package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 *
 * @author gww
 * @date 2020/08/16
 */
public class FlyweightFactory {
    private static Map<String,Flyweight> pool = new HashMap();

    public static Flyweight getFlyweight(String intrinsicState) {
        if (!pool.containsKey(intrinsicState)) {
            System.out.println("如果没有，则放到缓存Map中");
            pool.put(intrinsicState, new ConcreteFlyweight(intrinsicState));
        }
        return pool.get(intrinsicState);
    }
}
