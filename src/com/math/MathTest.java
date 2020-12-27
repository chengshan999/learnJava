package com.math;

public class MathTest {
    public static void main(String[] args){
        //Math类的所有方法都是静态方法

        //Math.round()
        Float f1 = 5.85f;
        Double d1 = 5.45;
        System.out.println(Math.round(f1));
        System.out.println(Math.round(d1));
        System.out.println();

        //Math.ceil()
        System.out.println(Math.ceil(f1));
        System.out.println(Math.ceil(d1));
        System.out.println();

        //Math.floor()
        System.out.println(Math.floor(f1));
        System.out.println(Math.floor(d1));
        System.out.println();

        //Math.random()
        System.out.println(Math.random());
        System.out.println(Math.random());
        System.out.println();
    }
}
