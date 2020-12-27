package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTestPro {

    public List<Course> courseToList;

    public ListTestPro(){
        this.courseToList = new ArrayList<Course>();
    }

    public void addTest(){
        Course c1 = new Course(1,"高等数学");
        courseToList.add(c1);
        //泛型List中无法添加出泛型类型及其子类型以外的类型
        //courseToList.add("尝试下添加字串类型到List中");
        Course[] cs1 = {new Course(2,"高等化学"),new Course(3,"大学英语")};
        courseToList.addAll(Arrays.asList(cs1));
        for(Course c:courseToList){
            System.out.println("当前课程："+c.name);
        }

    }

    public static void main(String[] args){
        ListTestPro ltp = new ListTestPro();
        ltp.addTest();

    }

}
