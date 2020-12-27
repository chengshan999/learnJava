package com.listTest;

import java.util.Objects;

public class Person{
    String firstName;
    String lastName;
    int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * TODO: 覆写equals方法
     */
    public boolean equals(Object o) {
        if(o instanceof Person) {
            //是Person类的实例，否则必然不相等
            Person p = (Person) o;
            //null不是任何类的实例
            Boolean result = true;
            if(!Objects.equals(this.firstName,p.firstName)) {
                result = false;
            }
            if(!Objects.equals(this.lastName,p.lastName)) {
                result = false;
            }
            if(this.age != p.age) {
                result = false;
            }
            return result;
        }
        return false;
    }

    /*
    * 复写hashCode方法
    *
    * hashCode方法用于HashMap把key计算成整数用
    * */
    public int hashCode(){
        return Objects.hash(this.firstName,this.lastName,this.age);
    }
}
