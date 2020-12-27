package com.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Scanner;

public class MapTest {

    public HashMap<String,Student> students = new HashMap<String,Student>();

    /*
    * 新建学生到Map中
    * */
    public void addStudent(){
        //先添加三个学生
        Scanner console = new Scanner(System.in);
        int i = 0;
        while(i<3){
            System.out.println("请输入学生ID：");
            String id = console.next();
            Student s = students.get(id);
            if(s == null){
                System.out.println("请输入学生姓名：");
                String name = console.next();
                Student student = new Student(Integer.parseInt(id),name);
                students.put(id,student);
                System.out.println("添加了学生："+student.id+"-"+student.name);
                i++;
            }else{
                System.out.println("该ID已经被占用");
                continue;
            }
        }
    }


    /*
    * 试用HashMap的keySet方法
    *
    * 顺便遍历Students
    * */
    public void forEachStudents(){
        Set<String> ks = students.keySet();
        System.out.println("共有学生数量"+students.size()+"个，具体如下：");
        for(String key: ks){
            Student student = students.get(key);
            if( student != null){
                System.out.println("学生ID："+student.id+"-学生姓名："+student.name);
            }
        }
    }

    /*
    * set的删除
    * */
    public void testDel(){
        System.out.println("");
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.println("请输入需要删除的学生的ID");
            String id = console.next();
            Student st = students.get(id);
            if(st == null){
                System.out.println("该ID不存在");
                continue;
            }
            students.remove(id);
            System.out.println("成功删除学生："+st.name);
            break;
        }
    }

    /*
    * Entry方法遍历Set
    *
    * */
    public void entryForEach(){
        System.out.println("");
        System.out.println("Entry 方法遍历数据");
        Set<Entry<String,Student>> entrySet = students.entrySet();
        for(Entry<String,Student> entry:entrySet){
            System.out.println("取得键："+entry.getKey());
            System.out.println("取得对应的值："+entry.getValue().name);
        }
    }

    /*
    * Set更新操作
    * */
    public void testModify(){
        System.out.println("");
        System.out.println("尝试更新操作");
        Scanner console = new Scanner(System.in);
        while(true){
            System.out.println("请输入学生ID:");
            String id = console.next();
            Student st = students.get(id);
            if(st == null){
                System.out.println("无效的ID");
                continue;
            }
            System.out.println("请输入学生名字:");
            String stName = console.next();
            Student newSt = new Student(Integer.parseInt(id),stName);
            students.put(id,newSt);
            System.out.println("添加成功");
            break;
        }
    }

    /*
    * containsValue
    * containsKey
    *
    * */
    public void testContains(){
        System.out.println("");
        System.out.println("查看是否包含某学生，请输入ID：");
        Scanner console = new Scanner(System.in);
        String id = console.next();
        if(students.containsKey(id)){
            Student st = students.get(id);
            System.out.println("该学生存在，姓名为："+st.name);
        }else{
            System.out.println("不存在该学生");
        }

        //containsValue
        System.out.println("查看是否包含某学生，请输入学生姓名：");
        String stName = console.next();
        Student s1 = new Student(1,stName);
        if(students.containsValue(s1)){
            System.out.println("该学生存在，姓名为："+s1.name);
        }else{
            System.out.println("该学生不存在");
        }

    }

    public static void main(String[] args){
        MapTest mt = new MapTest();
        mt.addStudent();
        mt.forEachStudents();
        /*mt.testDel();
        mt.entryForEach();
        mt.testModify();
        mt.entryForEach();*/
        mt.testContains();
    }
}
