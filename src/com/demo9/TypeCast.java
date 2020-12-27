package com.demo9;

import java.util.Arrays;

public class TypeCast {
    public static void main(String [] args){
        //valueOf  基本类型转换成字串
        System.out.println(String.valueOf(123));//int
        System.out.println(String.valueOf(123.32));//double
        System.out.println(String.valueOf(123.32f));//float
        System.out.println(String.valueOf(false));//boolean

        //String类型转换成其他类型
        System.out.println(Integer.parseInt("123"));//int
        System.out.println(Integer.parseInt("ff",16));//int

        //String 转换 char
        char[] c = "hello".toCharArray();
        System.out.println(Arrays.toString(c));
        String s = new String(c);
        System.out.println(s);
    }
}
