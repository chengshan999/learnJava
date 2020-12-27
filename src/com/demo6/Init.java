package com.demo6;

public class Init {
    public static void main(String[] args ){
        Person p = new Chinese();
        Person p1 = new American();

        p.say();
        p1.say();

        IPerson p2 = new Chinese();
        IPerson p3 = new American();

        p2.say();
        p3.say();
    }
}
