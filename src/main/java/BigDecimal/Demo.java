package BigDecimal;

import java.math.BigDecimal;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2020/1/21 14:22
 * @version:
 * @modified By:
 */
public class Demo {
    public static void main(String[] args) {
        BigDecimal big1 = BigDecimal.valueOf(1.0);
        BigDecimal big2 = BigDecimal.valueOf(-2);
        BigDecimal big3 = BigDecimal.valueOf(3);
        BigDecimal big4 = BigDecimal.valueOf(5);
        BigDecimal big5 = new BigDecimal(6);
        BigDecimal big6 = new BigDecimal(8);
        BigDecimal big7 = new BigDecimal(1.00);
        System.out.println(big1.equals(big2));
        System.out.println(big1.equals(big7));
        System.out.println("big1 > big2  ="+big1.compareTo(big2));//1
        System.out.println("big1 < big3 ="+big1.compareTo(big3));//-1
        System.out.println("big1 = big7 ="+big1.compareTo(big7));//0
    }
}
