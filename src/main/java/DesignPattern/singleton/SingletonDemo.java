package DesignPattern.singleton;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/16 12:04
 * @version: 枚举
 * @modified By:
 */

/**
 * 如何选用：
 *
 * -单例对象 占用资源少，不需要延时加载，枚举 好于 饿汉
 *
 * -单例对象 占用资源多，需要延时加载，静态内部类 好于 懒汉式
 */
public enum SingletonDemo {
    INSTANCE;

    public void SingletoDemo(){

    }
}
