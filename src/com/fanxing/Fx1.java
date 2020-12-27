package com.fanxing;

import java.lang.*;
import java.util.Arrays;

/*
* 泛型
* */
public class Fx1 {
    public static void main(String[] args){
        String[] strList = new String[]{"zhangsan","lisi","wangermazi"};
        Arrays.sort(strList);
        System.out.println(Arrays.toString(strList));
    }
}


