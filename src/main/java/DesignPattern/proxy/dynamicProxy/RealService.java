package DesignPattern.proxy.dynamicProxy;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 15:27
 * @version:
 * @modified By:
 */
public class RealService implements Iservice {
    @Override
    public void say() {
        System.out.println("被代理对象执行相关操作");
    }
}
