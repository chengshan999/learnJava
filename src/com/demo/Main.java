package com.demo;

public class Main {
    int arg1;
    float arg2 ;

    public static void main(String[] args) {
        Main print = new Main();
        print.setArgs1(1,1.5f);
        System.out.println("");
        print.setArgs2(1,1.5f);
        System.out.println("");
        print.setArgs3(1,1.5f);
    }
    public void setArgs1(int arg1, float arg2){
        arg1 = arg1;
        arg2 = arg2;
        System.out.println(arg1);
        System.out.println(this.arg1);
        System.out.println(arg2);
        System.out.println(this.arg2);
    }
    public void setArgs2(int arg1, float arg2){
        this.arg1 = arg1;
        this.arg2 = arg2;
        System.out.println(arg1);
        System.out.println(this.arg1);
        System.out.println(arg2);
        System.out.println(this.arg2);
    }
    public void setArgs3(int newArg1, float newArg2){
        arg1 = newArg1;
        arg2 = newArg2;
        System.out.println(arg1);
        System.out.println(this.arg1);
        System.out.println(arg2);
        System.out.println(this.arg2);
    }
}
