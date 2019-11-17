package DesignPattern.proxy.staticProxy;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 15:06
 * @version: 目标对象角色
 * @modified By:
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        //
        System.out.println("一些操作");
    }
}
