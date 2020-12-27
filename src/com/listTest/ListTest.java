package com.listTest;

import java.util.List;
import java.util.Objects;

public class ListTest {
    public static void main(String[] args){
        ListTest o1 = new ListTest();
        //o1.test1();
        //o1.test2();
        //o1.test3();
        //o1.test4();
        //o1.test5();
        //o1.test6();
        o1.test7();
    }

    public void test1(){
        List<String> l1 = List.of(new String[] {"A","B","C"});
        for(String s : l1){
            System.out.println(s);
        }
        //List转Array
        String[] a1 = l1.toArray(new String[3]);
        System.out.println(a1.toString());
    }
    public void test2(){
        List<String> l1 = List.of("A","B","C");
        System.out.println(l1.contains("C"));//true
        System.out.println(l1.contains("X"));//false
        System.out.println(l1.indexOf("C"));//2
        System.out.println(l1.indexOf("X"));//-1
    }
    public void test3(){
        List<String> l1 = List.of("A","B","C");
        //创建一个新的引用，结果还是true，说明只对比了值，没有对比引用
        //==比对后结果为false，说明是不同的引用
        System.out.println("C" == new String("C"));//false
        System.out.println(l1.contains(new String("C")));//true
        System.out.println(l1.contains(new String("X")));//false
        System.out.println(l1.indexOf(new String("C")));//2
        System.out.println(l1.indexOf(new String("X")));//-1
    }
    /*public void test4(){
        Person p1 = new Person("Li Lei");
        Person p2 = new Person("Han Meimei");
        Person p3 = new Person("Lucy");
        List<Person> l1 = List.of(new Person[]{p1,p2,p3});

        Person p4 = new Person("Lucy");
        //==比对后结果为false，说明是不同的引用
        System.out.println(p3 == p4);//false
        //那么用contains判断下试试
        System.out.println(l1.contains(p4));//false
        System.out.println(l1.indexOf(p4));//-1
        //为何和test3中的结果不一样，因为Person类中没有重写equals方法
    }*/
    public void test5(){
        List<Integer> l1 = List.of(1,2,3);
        //创建一个新的引用，结果还是true，说明只对比了值，没有对比引用
        //==比对后结果为false，说明是不同的引用
        System.out.println(3 == new Integer(3));//true
        System.out.println(l1.contains(new Integer(3)));//true
        System.out.println(l1.indexOf(new Integer(3)));//2
    }
    public void test6(){
        System.out.println(null instanceof Person);//false
        System.out.println(Objects.equals(null,"null"));//false
        System.out.println(Objects.equals(null,null));//true
    }
    /*
    * 使用Object.equals重写equals方法
    * */
    public void test7(){
        List<Person> list = List.of(new Person("Xiao", "Ming", 18), new Person("Xiao", "Hong", 25),
                new Person("Bob", "Smith", 20));
        boolean exist = list.contains(new Person("Bob", "Smith", 20));
        System.out.println(exist ? "测试成功!" : "测试失败!");
    }

}

/*class Person{
    String name;
    int age;
    public void Person(String s){
        name = s;
    }
}*/
