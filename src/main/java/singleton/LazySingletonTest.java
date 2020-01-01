package singleton;

/**
 * 懒汉式:
 */
public class LazySingletonTest {

    public static void main(String[] args) {
        // 普通懒汉式
//        LazySingleton instance1 = LazySingleton.getInstance();
//        LazySingleton instance2 = LazySingleton.getInstance();
//        System.out.println(instance1 == instance2);
        // 懒汉式-加锁

        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        System.out.println(LazySingleton.getInstance());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            },"线程"+i).start();
        }
    }
}

/**
 * 线程不安全的懒汉式
 */
//class LazySingleton{
//    private static LazySingleton lazySingleton = null;
//    static LazySingleton getInstance() throws InterruptedException {
//        if (lazySingleton == null){
//            Thread.sleep(3000);
//            lazySingleton = new LazySingleton();
//        }
//        return lazySingleton;
//    }
//}

/**
 * 双重检查
  */
class LazySingleton{
    private static LazySingleton lazySingleton = null;
    // 私有构造
    private LazySingleton() {
    }
    static LazySingleton getInstance() throws InterruptedException {
        if (lazySingleton == null){
            synchronized (LazySingleton.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
