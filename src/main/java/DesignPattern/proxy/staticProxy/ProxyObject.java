package DesignPattern.proxy.staticProxy;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 15:07
 * @version: 代理对象角色
 * @modified By:
 */
public class ProxyObject extends AbstractObject {
    RealObject ro = new RealObject();
    @Override
    public void operation() {
        //调用目标前做一些操作
        System.out.println("before");
        ro.operation();
        //调用目标之后做一些操作
        System.out.println("after");
    }
}
