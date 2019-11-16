package DesignPattern.prototype;

/**
 * @description:懒汉单列
 * @author: gmf
 * @date: Created in 2019/11/16 11:32
 * @version:
 * @modified By:
 */

/**
 * 注意：如果编写的是多线程程序，则不要删除上例代码中的关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
 * 如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，
 * 会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。
 */
public class LazySingleton {
    //保证instance在所有的线程都同步
    private static volatile  LazySingleton instance = null;
    //避免被实列化
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
