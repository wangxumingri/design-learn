package proxy.dynamicDemo;

public class Client {
    public static void main(String[] args) {
//         目标对象
        CarService userService = new CarServiceImpl();
        ProxyFactory proxyFactory = new ProxyFactory(userService);
        // 生成代理对象
        CarService proxyInstance = (CarService)proxyFactory.getProxyInstance();
        proxyInstance.getAll();
    }
}
