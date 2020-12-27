package com.string1;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args){
        //测试常用的字符串方法
        String s1 = "abc123abc123";
        //length()
        System.out.println(s1.length());
        //indexOf()
        System.out.println(s1.indexOf("c"));
        System.out.println(s1.indexOf("12"));
        //lastIndexOf()
        System.out.println(s1.lastIndexOf("c"));
        System.out.println(s1.lastIndexOf("12"));
        //substring()
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,9));
        //trim()
        String s2 = " abc123 ";
        System.out.println(s2);
        System.out.println(s2.trim());
        //equals()
        String s3 = "abc123abc123";
        String s4 = new String("abc123abc123");
        System.out.println(s1 == s3);//比对引用，为同一个常量值，指向相同的内存，相同
        System.out.println(s1.equals(s3));//只比较值，不比较引用，相同
        System.out.println(s1 == s4);//比对引用，不用的对象占用不用的内存，不相同，
        System.out.println(s1.equals(s4));//只比较值，不比较引用，相同
        //toUpperCase()
        String s5 ="abc123ABC123";
        System.out.println(s5);
        System.out.println(s5.toUpperCase());
        //toLowerCase()
        System.out.println(s5.toLowerCase());
        //charAt()
        System.out.println(s5.charAt(3));
        //split()
        String[] arr1 = s5.split("");
        System.out.println(Arrays.toString(arr1));
    }
}
