package singleton;

public class InnerClassSingletonTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println(instance);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                InnerClassSingleton instance = InnerClassSingleton.getInstance();
                System.out.println(instance);
            }
        }).start();
    }
}

class InnerClassSingleton{
    // 在静态内部类中初始化实例
    private static class InnerSingletonHolder{
        private static InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
    // 返回静态内部类中的实例
    public static InnerClassSingleton getInstance(){
        return InnerSingletonHolder.innerClassSingleton;
    }
    // 私有构造
    private InnerClassSingleton(){};
}
