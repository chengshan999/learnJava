package com.annotation;

public class Test {

    //@Check(min=50,max=100,value=80)
    public int a;

    //@Check(value=70)
    public int b;

    //@Check(75)
    public int c;

    //@Check
    public int d;

    public static void main(String[] args){


    }

    public void check(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
