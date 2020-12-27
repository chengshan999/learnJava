package com.Exception;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args){
        byte[] ba = toGBK("中文");
        System.out.println(Arrays.toString(ba));
    }
    public static byte[] toGBK(String s){
        try{
            return s.getBytes("GBK");
        }catch(UnsupportedEncodingException e){
            e.getStackTrace();
        }
        return null;
    }
}
