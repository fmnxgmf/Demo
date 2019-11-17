package DesignPattern.bridge;

import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:10
 * @version: 抽象消息类
 * @modified By:
 */

/**
 * 抽象化(Abstraction)角色：抽象化给出的定义，并保存一个对实现化对象的引用。
 * 修正抽象化(RefinedAbstraction)角色：扩展抽象化角色，改变和修正父类对抽象化的定义。
 * 实现化(Implementor)角色：这个角色给出实现化角色的接口，但不给出具体的实现。必须指出的是，这个接口不一定和抽象化角色的接口定义相同，
 *      实际上，这两个接口可以非常不一样。实现化角色应当只给出底层操作，而抽象化角色应当只给出基于底层操作的更高一层的操作。
 * 具体实现化(ConcreteImplementor)角色：这个角色给出实现化角色接口的具体实现。
 */
public abstract class AbstractMessage {
    //  持有一个实现部分的对象
    MessageImplementor impl;
    /**
     * 构造方法，传入实现部分的对象
     */
    public AbstractMessage(MessageImplementor impl){
        this.impl = impl;
    }
    /**
     * @description
     * @author gmf
     * @date 2019/11/17 14:23
     * @param message 发送消息的内容
     * @param toUser 消息的接收者
     * @return
     */
    public void sendMessage(String message,String toUser){
        this.impl.send(message,toUser);
    }
}
