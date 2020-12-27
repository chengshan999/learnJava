package com.demo;

public class Bus extends Traffic {

    public int age = 6;
    public void run(){
        System.out.println(name+"的年龄"+age);
        System.out.println("会跑,但是跑的不快");
    }
    public Bus(){
        System.out.println("我是Bus类的构造方法");
    }
    public void test(){
        System.out.println("父类的年龄："+super.age);
        System.out.println("子类的年龄："+age);

        System.out.println("父类的run方法");
        super.run();

        System.out.println("子类的run方法");
        run();
    }
    public String toString(){//重写了Object类的自有toString方法
        return "Bus[age="+age+"】";
    }
}
