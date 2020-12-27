package com.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;

public class SetTest {

    public List<Course> courseToList = new ArrayList<Course>();

    public Student s_zhang = new Student(1,"张三");

    public void addCourse(){
        //add方法
        Course c1 = new Course(1,"语文");
        courseToList.add(c1);
        Course temp1 = (Course) courseToList.get(0);
        System.out.println("添加了课程："+temp1.id+"-"+temp1.name);

        Course c2 = new Course(2,"数学");
        courseToList.add(c2);
        Course temp3 = (Course) courseToList.get(1);
        System.out.println("添加了课程："+temp3.id+"-"+temp3.name);

        Course c3 = new Course(3,"英语");
        courseToList.add(0,c3);
        Course temp4 = (Course) courseToList.get(0);
        System.out.println("添加了课程："+temp4.id+"-"+temp4.name);


        courseToList.add(3,new Course(4,"物理"));

        //addAll方法
        Course[] c5 = {new Course(5,"化学"),new Course(6,"生物")};
        courseToList.addAll(Arrays.asList(c5));
        Course temp5 = (Course) courseToList.get(4);
        Course temp6 = (Course) courseToList.get(5);
        System.out.println("添加了两门课程："+temp5.id+"-"+temp5.name+";"+temp6.id+"-"+temp6.name);

        Course[] c6 = {new Course(7,"地理"),new Course(8,"历史") };
        courseToList.addAll(4,Arrays.asList(c6));
        Course temp7 = (Course) courseToList.get(4);
        Course temp8 = (Course) courseToList.get(5);
        System.out.println("添加了两门课程："+temp7.id+"-"+temp7.name+";"+temp8.id+"-"+temp8.name);
    }
    public void courseForEach(){
        System.out.println("");
        System.out.println("目前共有课程如下：");
        for(Course c : courseToList){
            System.out.println("当前课程为："+c.id+"-"+c.name);
        }
    }

    /*
    * 让同学张三输入课程ID选课程,能选三门
    * */
    public void studentSelectCourse(){
        System.out.println("");
        System.out.println("学生"+s_zhang.name+"开始选课：");

        Scanner console = new Scanner(System.in);
        for(int i = 0;i < 3 ; i++){
            String id =  console.next();
            for(Course c : courseToList){
                if(id.equals( String.valueOf(c.id))){
                    s_zhang.course.add(c);
                    /*
                    * set中添加某个对象无论添加多少次，
                    * 最终只会保留一个该对象（的引用），
                    * 并且，保留的是第一次添加的那个
                    * */
                    s_zhang.course.add(c);//set类型无法添加重复的数据
                    System.out.println("选课程"+c.name+"成功");
                }
            }
        }

        System.out.println("学生"+s_zhang.name+"共选了"+s_zhang.course.size()+"门课程，如下：");
        for(Course c1:s_zhang.course){
            System.out.println(c1.id+"-"+c1.name);
        }
    }

    /*
    * 使用contains方法
    * */
    public void testContains(){
        System.out.println("");
        System.out.println("看下学生"+s_zhang.name+"是否选了下面输入的课程：");
        Scanner console = new Scanner(System.in);
        System.out.println("请输入课程：");
        String courseName = console.next();
        Course c = new Course();
        c.name = courseName;
        boolean result = s_zhang.course.contains(c);
        System.out.println("看下学生"+s_zhang.name+"是否选了下面输入的课程："+result);
    }

    public static void main(String[] args){
        SetTest st = new SetTest();
        st.addCourse();
        st.courseForEach();
        st.studentSelectCourse();
        st.testContains();
    }
}
