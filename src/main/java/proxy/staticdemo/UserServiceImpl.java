package proxy.staticdemo;

public class UserServiceImpl implements UserService{
    @Override
    public void getAll() {
        System.out.println("proxy.staticdemo.UserServiceImpl:getAll");
    }
}
