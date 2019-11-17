package DesignPattern.bridge;

import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:11
 * @version: 普通消息类
 * @modified By:
 */
public class CommonMessage extends AbstractMessage{
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl
     */
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        //对于普通消息直接调用父类方法发送消息即可
        super.sendMessage(message, toUser);
    }
}
