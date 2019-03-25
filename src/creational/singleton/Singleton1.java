package creational.singleton;

/**
 * 单例模式，懒汉式，线程不安全
 */
public class Singleton1 {
    private static Singleton1 singleton;

    private Singleton1() {}

    public static Singleton1 getInstance() {
        if (singleton == null) {
            singleton = new Singleton1();
        }
        return singleton;
    }
}
