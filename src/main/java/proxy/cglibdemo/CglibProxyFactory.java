package proxy.cglibdemo;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    public Object getCglibProxyInstance(){
        Enhancer enhancer = new Enhancer();
        // 1.设置目标类
        enhancer.setSuperclass(target.getClass());
        // 2.设置回调
        enhancer.setCallback(this);
        // 3.创建代理对象
        return enhancer.create();
    }

    /**
     * 拦截目标对象的方法，进行增强
     * @param obj 代理对象
     * @param method 执行的方法
     * @param args 方法参数
     * @param proxy 方法处理
     * @return
     * @throws Throwable
     */
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib 动态代理执行前...");
        Object result= method.invoke(target, args);
        System.out.println("cglib 动态代理执行后...");
        return result;
    }
}
