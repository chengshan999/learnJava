package com.fanxing;

import java.util.Arrays;
public class Fx2 {
    public static void main(String[] args){
        Person[] ps = new Person[]{
                new Person("zhangsan",28),
                new Person("lisi",29),
                new Person("wangermazi",30),
        };
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
    }
}
class Person implements Comparable<Person>{
    String name;
    int score;
    Person(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String toString() {
        return this.name + "," + this.score;
    }

    public int compareTo(Person other){
        return this.name.compareTo(other.name);
    }
}
