package DesignPattern.bridge;

import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:12
 * @version: 加急消息类
 * @modified By:
 */
public class UrgencyMessage  extends AbstractMessage {
    /**
     * 构造方法，传入实现部分的对象
     *
     * @param impl
     */
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    public void sendMessage(String message, String toUser) {
        message = "加急"+message;
        super.sendMessage(message, toUser);
    }
    /**
     * 扩展自己的新方法
     */
    public void wantch(){

    }
}
