package DesignPattern.proxy.dynamicProxy;

import DesignPattern.proxy.staticProxy.AbstractObject;
import DesignPattern.proxy.staticProxy.RealObject;

import java.lang.reflect.Proxy;

/**
 * @description:动态代理proxy只能是接不能抽象类
 * @author: gmf
 * @date: Created in 2019/11/17 15:16
 * @version:
 * @modified By:
 */
public class Demo {
    public static void main(String[] args) {
        Iservice is = new RealService();
        Class<? extends Iservice> aClass = is.getClass();
        Iservice proxy = (Iservice)Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), new DynamicProxy(is));
        proxy.say();
    }
}
