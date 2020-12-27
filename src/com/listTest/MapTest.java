package com.listTest;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args){
        MapTest mt = new MapTest();
        mt.testKeySet();
        mt.testEntrySet();
        mt.testObjectKey();
    }

    /*
    * 测试HashMap的keySet方法
    * */
    void testKeySet(){
        Map<String,Integer> m = new HashMap<>();
        m.put("Lucy",89);
        m.put("Lily",90);
        m.put("Li Lei",92);
        for(String name : m.keySet()){
            System.out.println(name +":"+ m.get(name));
        }
    }
    /*
    * 测试HashMap的entrySet方法
    * */
    void testEntrySet(){
        Map<String,Integer> m = new HashMap<>();
        m.put("Ling tao",85);
        m.put("Han Meimei",95);
        m.put("Jim",83);
        for(Map.Entry<String,Integer> e : m.entrySet()){
            System.out.println(e.getKey() +":"+ e.getValue());
        }
    }

    /*
    * 1 HashMap会把Key通过hashCode计算成int，然后把value存在一个数组里，索引值即刚才hashCode后的int
    * 2 如果key是一个自己实现的类，需要重写hashCode方法
    * */
    void testObjectKey(){
        Map<Person,Integer> m = new HashMap<Person,Integer>();
        Person p1 = new Person("Xiao", "Ming", 18);
        Person p2 = new Person("Xiao", "Ming", 25);
        Person p3 = new Person("Xiao", "Ming", 18);
        m.put(p1,18);
        m.put(p2,19);
        m.put(p3,20);

        //如果Person类重写hashCode方法，则同名同年龄的Person实例会被当成同一个人
        //不重写，同名同年龄的Person实例会被当成不同的人
        System.out.println(m.get(p1));
        System.out.println(m.get(p2));
        System.out.println(m.get(p3));
    }
}

