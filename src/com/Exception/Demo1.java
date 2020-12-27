package com.Exception;

import java.io.UnsupportedEncodingException;
import java.io.IOException;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args){
        try{
            byte[] ba = toGBK("中文");
            System.out.println(Arrays.toString(ba));
        }catch(UnsupportedEncodingException e){
            e.printStackTrace();
            System.out.println("UnsupportedEncodingException");
        }catch(IOException e){
            System.out.println("IOException");
        }
    }
    public static byte[] toGBK(String s) throws UnsupportedEncodingException {
        return s.getBytes("GBK");
    }
}
