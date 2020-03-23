package proxy.cglibdemo;

public class Client {
    public static void main(String[] args) {
        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(new PhoneService());
        PhoneService cglibProxyInstance = (PhoneService)cglibProxyFactory.getCglibProxyInstance();
        cglibProxyInstance.getAll();
    }
}
