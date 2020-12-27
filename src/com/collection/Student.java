package com.collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    public int id;
    public String name;

    //set中添加某个对象无论添加多少次，最终只会保留一个该对象（的引用），并且，保留的是第一次添加的那个

    public Set<Course> course = new HashSet<Course>();

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
