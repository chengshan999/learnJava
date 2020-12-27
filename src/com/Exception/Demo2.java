package com.Exception;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) throws Exception{
        byte[] ba = toGBK("中文");
        System.out.println(Arrays.toString(ba));
    }
    public static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
}
