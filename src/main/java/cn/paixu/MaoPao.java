package cn.paixu;

import org.junit.Test;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/7 23:30
 * @version:
 * @modified By:
 */
public class MaoPao {

    public static void main(String[] args) {
        int[] arr = {5,7,3,11,22,54,44};
        int leng = arr.length;
        for(int i=0;i<leng-1;i++){
            for (int j = 0; j <leng-1-i ; j++) {
                if(arr[j]>arr[j+1]){
                    System.out.println("arr[i]"+""+arr[j]);
                    System.out.println("arr[i]"+""+arr[j+1]);
                    arr[j] = arr[j+1]^arr[j];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                    System.out.println("arr[i]"+""+arr[j]);
                    System.out.println("arr[i]"+""+arr[j+1]);
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void demo(){
        int a =3;
        int b = 7;
        int c = 9;
        //language=JSON
        String str = "{\"name\": \"czc\",\"age\": 22}";
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println(a);
        System.out.println(b);
    }
}
