package DesignPattern.bridge;

import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:10
 * @version: 抽象消息类
 * @modified By:
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
