package DesignPattern.singleton;

/**
 * @description:线程安全，调用效率高，可以延时加载
 * @author: gmf
 * @date: Created in 2019/11/16 11:55
 * @version: 静态内部类
 * @modified By:
 */
public class SingletonStaic {
    private static class  SingletonInstance{
        private static final SingletonStaic ss = new SingletonStaic();
    }
    private SingletonStaic(){}

    public static SingletonStaic getInstance(){
        return SingletonInstance.ss;
    }
}
