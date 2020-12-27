package com.demo3;

public class InitTelphone {
    public static void main(String [] args){
        Telphone t1 = new Telphone();
        t1.screen = 6.5f;
        t1.cpu = 3.0f;
        t1.memory = 6;
        System.out.println("对象的类型："+t1.getClass());
        Telphone t2 = new Telphone();
        t2.screen = 6.5f;
        t2.cpu = 3.0f;
        t2.memory = 6;
        System.out.println("对象的类型："+t1.getClass());

        if(t1.equals(t2)){
            System.out.println("两个对象相同");
        }else{
            System.out.println("两个对象不相同");
        }

    }
}
