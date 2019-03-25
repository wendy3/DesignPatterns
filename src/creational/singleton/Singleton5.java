package creational.singleton;

/**
 * 单例模式，静态内部类
 */
public class Singleton5 {
    private static class SingletonHolder {
        private static final Singleton5 singleton = new Singleton5();
    }

    private Singleton5() {}

    public static final Singleton5 getInstance() {
        return SingletonHolder.singleton;
    }
}
