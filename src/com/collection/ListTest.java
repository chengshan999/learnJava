package com.collection;

import java.util.*;

public class ListTest {

    public List courseToList;

    public ListTest(){
        this.courseToList = new ArrayList();
    }
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

        /*System.out.println(courseToList.size());
        Course c4 = new Course(4,"物理");
        //插入时，如果Index值小于0，或大于当前List长度，会报下标越界错误
        courseToList.add(4,c4);
        //等于List长度，不会报错
        courseToList.add(3,c4);*/

        courseToList.add(3,new Course(4,"理综"));

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

    /*
    * for循环出List中所有元素
    * */
    public void testFor(){
        System.out.println("");
        System.out.println("for循环课程列表如下：");
        for(int i = 0;i<courseToList.size();i++){
            Course c = (Course) courseToList.get(i);
            System.out.println("课程："+c.id+"-"+c.name);
        }
    }

    /*
    * List迭代器循环出List中所有元素
    * */
    public void testIt(){
        System.out.println("");
        System.out.println("迭代器循环课程列表如下：");
        Iterator it = (Iterator) courseToList.iterator();
        while(it.hasNext()){
            Course c = (Course) it.next();
            System.out.println("课程："+c.id+"-"+c.name);
        }
    }

    /*
    * for each循环出List中所有元素
    * */
    public void testForEach(){
        System.out.println("");
        System.out.println("forEach循环课程列表如下：");
        for(Object obj:courseToList){
            Course c = (Course) obj;
            System.out.println("课程："+c.id+"-"+c.name);
        }
    }

    /*
    * List修改功能
    * */
    public void testModify(){
        System.out.println("");
        System.out.println("即将修改第4门课");
        courseToList.set(3,new Course(4,"物理"));
        System.out.println("第4门课修改完成");
    }

    /*
    * List删除功能
    * */
    public void testDelete(){
        System.out.println("");
        //根据键值删除
        Course c1 = (Course) courseToList.get(3);
        courseToList.remove(c1);
        System.out.println("删除课程："+c1.id+"-"+c1.name);
        testForEach();

        //根据索引下标删除
        courseToList.remove(3);
        System.out.println("");
        System.out.println("删除第4门课程：");
        testForEach();

        //根据键值批量删除
        Course[] cs1 = {(Course) courseToList.get(3),(Course) courseToList.get(4)};
        System.out.println("");
        System.out.println("删除两门课程：");
        courseToList.removeAll(Arrays.asList(cs1));
        testForEach();
    }

    /*
    * 泛型List添加泛型子类型
    * */
    public void addChildrenTest(){
        System.out.println("");
        ChildrenCourse cc1 = new ChildrenCourse();
        courseToList.add(cc1);
        cc1.id = 10;
        cc1.name = "我是子类型的课程";
        System.out.println("添加了一门泛型子类型的课程：");
        testForEach();
    }
    /*
    * 泛型不能使用基本类型，但是能使用基本类型的包装类
    * 基本类型如：int long boolean等
    * 基本类型的包装类如：Integer Long Boolean等
    * */
    public void addBasicType(){
        System.out.println("");
        //下面这句会报错
        //ArrayList<int> basicTest = new ArrayList<int>();
        ArrayList<Integer> basicTest = new ArrayList<Integer>();
        basicTest.add(3);
        System.out.println("整形的泛型List第一个元素为："+basicTest.get(0));
    }


    /*
    * 查询List中是否包含某个元素
    * */
    public void testContains(){
        System.out.println("");
        System.out.println("获取List的第一门课程：");
        Course c1 =(Course) courseToList.get(0);
        System.out.println("课程名称："+c1.name);
        System.out.println("List是否包含课"+c1.name+":"+courseToList.contains(c1));

        //获取元素的键名 indexOf
        //indexOf会和contains一样遍历List中的元素，
        //直到contains返回true,则返回当前元素的下标，随即停止遍历
        //如果不包含，则返回-1
        //lastIndexOf 使用方法同indexOf,只是从列尾往列头遍历，返回最后一个匹配元素的下标
        System.out.println("课程"+c1.name+"第一次出现的下标为："+courseToList.indexOf(c1));
        System.out.println("课程"+c1.name+"最后一次出现的下标为："+courseToList.lastIndexOf(c1));

        /*Course c2 =new Course(c1.id,c1.name);
        System.out.println("根据第一个课程的ID和NAME新建了一个课程C2");
        System.out.println("List是否包含课C2"+c2.name+":"+courseToList.contains(c2));
        System.out.println("虽然两个课程有相同的ID和name，但是是不同的对象，所以第二个新建的课程返回false");*/

        //重写Course的equals方法
        Scanner console = new Scanner(System.in);
        System.out.println("添加一个课程：");
        String name = console.next();
        Course c3 = new Course();
        c3.name = name;
        System.out.println("List是否包含课C3"+c3.name+":"+courseToList.contains(c3));


    }

    /*
    * 查询List中是否包含多个元素
    * */
    public void testContainsAll(){
        Course c1 = new Course();
        c1.name = "语文";
        Course c2 = new Course();
        c2.name = "数学";
        Course[] cs1 = {c1,c2};
        System.out.println("课程cs1有课程："+c1.name+"和"+c2.name);
        System.out.println("List是否包含课cs1:"+courseToList.containsAll(Arrays.asList(cs1)));
    }


    public static void main(String[] args){
        ListTest lt = new ListTest();
        lt.addCourse();
        lt.testFor();
        /*lt.testIt();
        lt.testModify();
        lt.testForEach();
        lt.testDelete();
        lt.addChildrenTest();
        lt.addBasicType();*/

        lt.testContains();
        lt.testContainsAll();
    }
}
