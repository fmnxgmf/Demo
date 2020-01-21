package string;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/23 12:28
 * @version:
 * @modified By:
 */
public class MaDian {
    public static void main(String[] args) {
        String demo = "hello?";
        System.out.println(demo.length());
        //得到码点数量
        System.out.println(demo.codePointCount(0,demo.length()));
        //返回从 startlndex 代码点开始位移 2 后的码点索引
        int i = demo.offsetByCodePoints(0, 2);
        //得到某个码点
        int i1 = demo.codePointAt(i);
        System.out.println("i = "+i+"\n"+"il = "+i1);
        System.out.println(i1=='l');

    }
}
