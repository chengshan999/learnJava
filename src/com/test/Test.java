package com.test;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException {
        //Number n = new Double(123.456);
        //String s = new Double(123.456);

        Class cla1 = Double.class;
        //Class cla2 = n.getClass();
        System.out.println(cla1.getName());
        Class cla3 = Class.forName("java.lang.Double");
        System.out.println(cla3);

    }
}
