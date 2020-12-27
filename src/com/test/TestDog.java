package com.test;

public class TestDog {
    public static void main(String[] args){

        Dog d1 = new Dog();
        Dog d2 = new Dog();

        if(d1 == d2){
            System.out.println("d1 和 d2 == 相同");
        }else{
            System.out.println("d1 和 d2 == 不同");
        }

        if(d1.equals(d2)){
            System.out.println("d1 和 d2 equals 相同");
        }else{
            System.out.println("d1 和 d2 equals 不同");
        }

        System.out.println("");
        //比较对象内的实例变量
        d1.setAge(3);
        d2.setAge(3);
        if(d1.getAge() == d2.getAge()){
            System.out.println("d1 和 d2 的age == 相同");
        }else{
            System.out.println("d1 和 d2 的age == 不同");
        }

        d1.setName("momo");
        d2.setName("momo");
        String s1 = d1.getName();
        String s2 = d2.getName();
        if(s1 == s2){
            System.out.println("d1 和 d2 的name == 相同");
        }else{
            System.out.println("d1 和 d2 的name == 不同");
        }
        if(s1.equals(s2)){
            System.out.println("d1 和 d2 的name equals 相同");
        }else{
            System.out.println("d1 和 d2 的name equals 不同");
        }
        String s3 = new String("momo");
        String s4 = new String("momo");
        if(s3.equals(s4)){
            System.out.println("s3 和 s4 equals 相同");
        }else{
            System.out.println("s3 和 s4 equals 不同");
        }

        System.out.println("");
        //重新赋值d1
        d1 = d2;
        System.out.println("重新赋值d1=d2");
        if(d1 == d2){
            System.out.println("d1 和 d2 == 相同");
        }else{
            System.out.println("d1 和 d2 == 不同");
        }
        if(d1.equals(d2)){
            System.out.println("d1 和 d2 equals 相同");
        }else{
            System.out.println("d1 和 d2 equals 不同");
        }

        //重新对d1和d2的实例变量赋值
        d1.setAge(5);
        d2.setAge(6);
        System.out.println("重新对d1和d2的实例变量赋值");
        System.out.println("d1的age为："+d1.getAge());
        System.out.println("d2的age为："+d2.getAge());
        if(d1 == d2){
            System.out.println("d1 和 d2 == 相同");
        }else{
            System.out.println("d1 和 d2 == 不同");
        }
        if(d1.equals(d2)){
            System.out.println("d1 和 d2 equals 相同");
        }else{
            System.out.println("d1 和 d2 equals 不同");
        }

    }
}
