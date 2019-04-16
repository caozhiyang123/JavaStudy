package cn.java.io.demo.byteStream.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory<T> {
	
    private T targetObject;
    
    public ProxyFactory(T targetObject) {
        super();
        this.targetObject = targetObject;
    }
    
    @SuppressWarnings("unchecked")
    public T getObject() {
        return (T) Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long beforeTime = System.currentTimeMillis();
                Object object = method.invoke(targetObject, args);
                long afterTime = System.currentTimeMillis();
                System.out.println("方法" + method.getName() + "的运行时间为：" + (afterTime - beforeTime) + "毫秒");
                return object;
            }
        });
    }

}