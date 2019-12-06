package cn.demo;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/5 22:59
 * @version:
 * @modified By:
 */
public class ClassB extends ClassA{
    public ClassB(){
        System.out.println("ClassB");
    }
    {
        System.out.println("i am Classb");
    }
    static {
        System.out.println("staitc b");
    }

    public static void main(String[] args) {
        new ClassB();
    }
}
