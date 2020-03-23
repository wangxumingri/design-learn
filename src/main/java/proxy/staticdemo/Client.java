package proxy.staticdemo;

public class Client {
    public static void main(String[] args) {
        // 目标对象
        UserService target = new UserServiceImpl();
        // 代理对象，代理目标对象
        UserService proxy = new UserServiceProxy(target);
        // 代理对象调用方法
        proxy.getAll();
    }
}
