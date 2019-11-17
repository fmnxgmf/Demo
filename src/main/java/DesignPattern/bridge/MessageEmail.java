package DesignPattern.bridge;

import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:19
 * @version: 邮件短消息的实现类
 * @modified By:
 */
public class MessageEmail implements MessageImplementor {

    @Override
    public void send(String message, String toUser) {
        System.out.println("使用邮件的方法,发送消息:"+message+"给"+toUser);
    }
}
