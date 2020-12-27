package com.test;

public class Dog {
    private int age;
    private String name;

    public void setAge(int a){
        age = a;
    }
    public int getAge(){
        return age;
    }
    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public void bark()
    {
        System.out.println("wang wang!");
    }
}
