package creational.singleton;

/**
 * 单例模式，饿汉式
 */
public class Singleton4 {
    private static Singleton4 singleton = null;

    static {
        singleton = new Singleton4();
    }

    private Singleton4() {}

    public static Singleton4 getInstance() {
        return singleton;
    }
}
