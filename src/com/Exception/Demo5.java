package com.Exception;

public class Demo5 {
    public static void main(String[] args){
        int x = -1;
        assert x > 0 : "x must > 0";
        System.out.println(x);
    }
}
