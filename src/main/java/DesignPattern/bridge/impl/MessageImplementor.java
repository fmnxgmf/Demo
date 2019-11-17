package DesignPattern.bridge.impl;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:14
 * @version: 实现发送消息的统一接口
 * @modified By:
 */
public interface MessageImplementor {
    /**
     * 发送消息
     */
    public void send(String message,String toUser);
}
