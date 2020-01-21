package cn.demo;

import org.junit.Test;

import java.util.Scanner;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/6 13:23
 * @version:
 * @modified By:
 */
public class StrNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
//        String str = "seign123";
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i]>='a'&&chars[i]<='z' || chars[i]>='A' && chars[i]<='Z'){
//                System.out.println(chars[i]);
//            }
//        }

    }
    @Test
    public void demo() {
        int shuzi = 0;//判断数字
        int kongge = 0;//判断空格
        int yingwen = 0;//判断英文
        int qita = 0;//判断其他字符
//        Scanner input = new Scanner(System.in);
//        String a = input.nextLine();
        String str = "seign123";
        char[] ar = str.toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if (Character.isDigit(ar[i])) {
//isDigit判断数组中是否有数字
                shuzi++;
            } else if (Character.isSpaceChar(ar[i])) {
//isSpaceChar判断是否有空格
                kongge++;
            } else if (Character.isLetter(ar[i])) {
//isLetter判断是否有字母
                yingwen++;
            } else {
                qita++;
            }
        }
        System.out.println("字母个数：" + yingwen);
        System.out.println("数字个数：" + shuzi);
        System.out.println("空格个数：" + kongge);
        System.out.println("其他字符个数：" + qita);
    }
  @Test
    public void test(){
        Scanner sc =new Scanner(System.in);
        String s = sc.nextLine();
      System.out.println(s);

  }

}
