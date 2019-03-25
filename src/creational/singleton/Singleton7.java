package creational.singleton;

/**
 * 单例模式，双重检查锁
 */
public class Singleton7 {
    private static Singleton7 singleton;

    private Singleton7() {}

    public static Singleton7 getInstance() {
        if (singleton == null) {
            synchronized (Singleton7.class) {
                if (singleton == null) {
                    singleton = new Singleton7();
                }
            }
        }
        return singleton;
    }
}
