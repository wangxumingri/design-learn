package proxy.dynamicDemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    // 目标类对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }


    public Object getProxyInstance(){
        /**
         * 参数1：目标对象的类加载器
         * 参数2：目标对象实现的接口
         * 参数3：事件处理
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            /**
             *
             * @param proxy 代理对象
             * @param method 目标对象执行的方法
             * @param args 执行方法的参数
             * @return 执行结果
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("1JDK动态代理执行前...");
                Object result = method.invoke(target, args);
                System.out.println("3JDK动态代理执行后...");
                return result;
            }
        });
    }

}
