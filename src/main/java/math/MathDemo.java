package math;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/18 13:12
 * @version:
 * @modified By:
 */
public class MathDemo {
    /**
     * 1、简单记忆：与y符号相同
     *
     * 2、x > y：结果的绝对值与 % 运算相同
     *
     * 3、x < y：①符号相同 结果的绝对值为 y - x ；②符号不同 结果的绝对值与 % 运算相同
     * @param args
     */
    public static void main(String[] args) {
        int i = Math.floorMod(12, -7);
        System.out.println(i);
        System.out.println(6/(-5));
        System.out.println(6/5);
        System.out.println(12%(-7));
        System.out.println(12%(7));
        System.out.println(Math.floor(-11.1));
        System.out.println(Math.floor(11.1));
        //四舍五入的原理是在参数上加0.5然后进行下取整
        System.out.println("Math.round(-11.6):"+Math.round(-11.6));//-12
        System.out.println("Math.round(-11.5)"+Math.round(-11.5));//-11
        System.out.println("Math.round(-11.3)"+Math.round(-11.3));//-11
        System.out.println("Math.round(11.5)"+Math.round(11.5));//12
    }
}
