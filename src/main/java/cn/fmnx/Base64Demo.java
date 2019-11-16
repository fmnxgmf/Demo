package cn.fmnx;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

/**
 * @description:
 * @author: gmf
 * @date: Created in 2019/11/6 14:27
 * @version: base64demo
 * @modified By:
 */
public class Base64Demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "wl and czc";
        String s = Base64.getEncoder().encodeToString(str.getBytes("utf-8"));
        System.out.println(s);
        byte[] bytes = Base64.getDecoder().decode(s);
        String s1 = new String(bytes,"utf-8");
        System.out.println(s1);
    }
}
