package DesignPattern.bridge.demo;

import DesignPattern.bridge.*;
import DesignPattern.bridge.impl.MessageImplementor;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 14:32
 * @version: 测试桥接模式
 * @modified By:
 */
public class Client {

    public static void main(String[] args) {
        //创建具体实现对象
        MessageImplementor impl = new MessageSMS();
        //创建普通消息对象
        AbstractMessage message = new CommonMessage(impl);
        message.sendMessage("xx申请树皮","czc");

        //切换方式为邮件
        impl = new MessageEmail();
        //创建加急
        message = new UrgencyMessage(impl);
        message.sendMessage("czc喜欢wl","wl");
    }
}
