package DesignPattern.bridge;

import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:16
 * @version: 系统内短消息的实现类
 * @modified By:
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("使用系统内短消息的方法,发送消息:"+message+"给"+toUser);
    }
}
