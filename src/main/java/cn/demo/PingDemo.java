package cn.demo;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/5 22:46
 * @version:
 * @modified By:
 */
public class PingDemo {
    public static void main(String[] args) {
        Thread tr = new Thread(){
            @Override
            public void run() {
                pong();
            }
        };
        tr.run();
        System.out.println("ping");
    }

    static void pong(){
        System.out.println("pong");
    }
}
