package cn.fmnx;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/10 11:34
 * @version:
 * @modified By:
 */
public class ListDemo {
    @Test
    public void demo(){
        String str = "and";
        List list= new ArrayList();
        list.add("and");
        list.add("wl");
        list.add("czc");
        list.add("and");
        list.add("or");
        list.add("and");
        list.add("happy");
        System.out.println("*************删除前****************");
        list.forEach(System.out::println);
        for (int i = 0; i < list.size(); i++) {
            if(str.equals(list.get(i))){
                list.remove(i);
            }
        }
        System.out.println("*************删除后****************");
        list.forEach(System.out::println);
    }

}
