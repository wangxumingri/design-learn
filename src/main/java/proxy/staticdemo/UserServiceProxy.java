package proxy.staticdemo;

public class UserServiceProxy implements UserService{
    private UserService target;

    /**
     *
     * @param target 目标类
     */
    public UserServiceProxy(UserService target) {
        this.target = target;
    }

    /**
     * 可以在目标对象执行前后，进行其他操作
     */
    @Override
    public void getAll() {
        System.out.println("UserServiceProxy: 目标对象getAll执行前的操作...");
        // 目标对象执行方法
        target.getAll();
        System.out.println("UserServiceProxy :目标对象getAll执行后的操作...");
    }
}
