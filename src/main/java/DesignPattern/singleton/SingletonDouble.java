package DesignPattern.singleton;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/16 11:47
 * @version: DCL也就是双重锁判断机制
 * @modified By:
 */
public class SingletonDouble {
    private volatile static    SingletonDouble sd ;
    private SingletonDouble(){}
    public static SingletonDouble getSd(){
        if(sd == null){
            synchronized (SingletonDouble.class){
                if(sd == null){
                    sd = new SingletonDouble();
                }
            }
        }
        return sd;
    }
}
