package cn.fmnx.Demo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/12/4 11:05
 * @version:
 * @modified By:
 */
public class NumAdd {

    public static void main(String[] args) {
        demo2(2,6);
    }
    /**
     * @description n 代表某个数，m代表位数
     * @author gmf
     * @date 2019/12/4 11:08
     * @param
     * @return
     */
    public static void demo(int n,int m){
        List<Integer> list = new ArrayList<Integer>();
        Integer tail = 0;
        for (int i = 1; i <=m ; i++) {
           int j = i;
            String str = "";
           while (j > 0 ){
               str = str + n;
               j--;
           }
           list.add(Integer.parseInt(str));
        }
        for (int i = 0; i < list.size(); i++) {
           tail = tail+list.get(i);
        }
        System.out.println(tail);
    }

    public static void demo2(int n,int m){
        int a =0;int sum =0;
        for(int i=0;i<m;i++){
            a=(a*10)+n;
            sum +=a;
        }
        System.out.println(sum);
    }
}
