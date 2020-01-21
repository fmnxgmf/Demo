package time;

import java.util.Date;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/23 12:55
 * @version:
 * @modified By:
 */
public class Demo {
    public static void main(String[] args) {
        System.out.printf("%tc",new Date());
        System.out.println();
        System.out.printf("%1$tT",new Date());
    }
}
