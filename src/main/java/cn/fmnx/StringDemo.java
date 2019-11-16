package cn.fmnx;

import org.junit.Test;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/7 16:26
 * @version:
 * @modified By:
 */
public class StringDemo {
    public static void main(String[] args) {
        String str = "wlanwdczlwlcwaswz";
        int len = str.length();
        int count = 0;
        for (int i = 0; i <len-1 ; i++) {
            if(str.charAt(i)=='w'){
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void demo(){
        String str = "wlanwdczlwlcwaswz";
        char[] chars = str.toCharArray();
        int count = 0;
        for (char aChar : chars) {
            if(aChar=='w'){
                count++;
            }
        }
        System.out.println(count);
    }
}
