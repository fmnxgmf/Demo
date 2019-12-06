package DesignPattern.prototype;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 16:15
 * @version:
 * @modified By:
 */
public class Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        RealType r1 = new RealType();
        RealType clone = (RealType)r1.clone();
        System.out.println("r1=clone："+(r1 == clone));
    }
}
