package creational.singleton;

/**
 * 单例模式，懒汉式，线程安全
 * 主要使用了sync关键字锁机制修饰方法
 */
public class Singleton2 {
    private static Singleton2 singleton;

    private Singleton2() {}

    public static synchronized Singleton2 getInstance() {
        if (singleton == null) {
            singleton = new Singleton2();
        }
        return singleton;
    }
}
