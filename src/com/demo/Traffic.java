package com.demo;

public class Traffic {//当类没有明确的继承另一个类的时候，那他就是继承的Object类
    public int age=5;
    public String name;
    public void run(){
        System.out.println(name+"的年龄"+age);
        System.out.println("会跑");
    }
    public Traffic(){//子类默认调用父类的无参构造方法
        System.out.println("我是Traffic类的无参构造方法");
    }
    public Traffic(int age){
        System.out.println("我是Traffic类的有参构造方法");
    }
}
