package cn.fmnx.Demo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/13 15:25
 * @version:
 * @modified By:
 */
public class StringDemo {
    //在一个字符串中找到最后一个只出现 一次的字符
    String str = "fjfdhd112uiibbuopp";
    public void piayStr(String string){
        Map map = new HashMap();
        char[] chars = string.toCharArray();
        for(int i=0;i<string.length();i++){
            if(map.get(chars[i])!=null){
                map.put(chars[i],map.get(chars[i]++));
            }
        }
    }
    public void piayStr2(String string){
        char[] chars = string.toCharArray();
        String str ="";
        for(int i=0;i<chars.length;i++){
            if(string.indexOf(chars[i])==string.lastIndexOf(chars[i])){
                str = chars[i]+"";
            }
        }
        System.out.println(str);
    }
    @Test
    public void dd(){
        piayStr2(str);
    }
}
