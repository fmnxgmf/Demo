package cn.demo;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/5 22:58
 * @version:
 * @modified By:
 */
public class ClassA {
    public ClassA(){
        System.out.println("ClassA");
    }
    {
        System.out.println("I am ClassA");
    }
    static {
        System.out.println("static A");
    }
}
