package com.collection;

import java.util.HashSet;
import java.util.Set;

public class Course {
    public int id;
    public String name;
    public Set Course;

    public Course(int id,String name){
        this.id = id;
        this.name = name;
        this.Course = new HashSet();
    }
    public Course(){

    }


    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /*
    * 重写equals方法
    * 用来比较课程名称是否相同
    * */
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Course)){
            return false;
        }
        Course c = (Course) obj;
        if(this.name == null){
            if(c.name == null){
                return true;
            }else{
                return false;
            }
        }else{
            if(this.name.equals(c.name)){
            //if(this.name==c.name){
                return true;
            }else{
                return false;
            }
        }
    }
}
