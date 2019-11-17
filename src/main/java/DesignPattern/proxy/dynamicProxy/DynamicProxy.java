package DesignPattern.proxy.dynamicProxy;

import DesignPattern.proxy.staticProxy.RealObject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 15:11
 * @version: 动态代理
 * @modified By:
 */
public class DynamicProxy implements InvocationHandler {
    //被代理的对象
    private RealService ro;
    public DynamicProxy(Object o){
        this.ro = (RealService) o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始执行"+method.getName()+"方法");
        //执行原对象的相关操作，容易忘记
        Object invoke = method.invoke(ro, args);
        System.out.println(method.getName()+"执行完毕");
        return invoke;
    }
}
