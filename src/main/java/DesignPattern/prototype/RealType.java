package DesignPattern.prototype;

/**
 * @description:具体原型类
 * @author: gmf
 * @date: Created in 2019/11/17 16:11
 * @version:
 * @modified By:
 */
public class RealType implements Cloneable{
    RealType(){
        System.out.println("具体原型创建成功");
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (RealType)super.clone();
    }
}
