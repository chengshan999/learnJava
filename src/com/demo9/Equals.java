package com.demo9;

public class Equals {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "Hello".toLowerCase();
        String s4 = "HELLO";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println("");

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println("");

        System.out.println(s1 == s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1.equalsIgnoreCase(s4));
        System.out.println("");
    }
}
