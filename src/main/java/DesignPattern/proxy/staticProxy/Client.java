package DesignPattern.proxy.staticProxy;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/17 15:09
 * @version:
 * @modified By:
 */
public class Client {
    public static void main(String[] args) {
        ProxyObject po = new ProxyObject();
        po.operation();
    }
}
