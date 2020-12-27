package com.collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class CollectionSort {

    /*
    *整型List的排序
    * */
    public void sortTest1(){
        List <Integer> integerList = new ArrayList<Integer>();
        Random r = new Random();
        for(int i=1;i<=10;i++){
            Integer num = r.nextInt(100);
            do{
                integerList.add(num);
                System.out.println("添加整数："+num);
            }while(!integerList.contains(num));
        }
        System.out.println("------------排序前---------");
        for(Integer n : integerList){
            System.out.println("当前数字为："+n);
        }
        System.out.println("------------排序后---------");
        Collections.sort(integerList);
        for(Integer n : integerList){
            System.out.println("当前数字为："+n);
        }

    }

    /*
    * 对字串泛型的List排序
    * */
    public void sortTest2(){
        List <String> stringList = new ArrayList<String>();
        stringList.add("kdfjlkl");
        stringList.add("fghnh");
        stringList.add("t7uhgf");
        System.out.println("------------排序前---------");
        for(String n : stringList){
            System.out.println("当前数据为："+n);
        }
        System.out.println("------------排序后---------");
        Collections.sort(stringList);
        for(String n : stringList){
            System.out.println("当前数据为："+n);
        }
    }

    /*
    *Collections.sort()
    * 排序
    * */
    public void sortTest3(){
        List <String> stringList = new ArrayList<String>();
        int num = 10;
        Random r = new Random();
        StringBuffer temp = new StringBuffer();
        for(char l='A';l<='Z';l++){
            temp.append(l);
        }
        for(char l='a';l<='z';l++){
            temp.append(l);
        }
        for(int l=0;l<=9;l++){
            temp.append(l);
        }
        int tempLen = temp.length();
        System.out.println("模板字串为："+temp);
        System.out.println("模板字串长度为："+tempLen);

        //组装List
        for(int i = 1; i<=num; i++ ){
            //生成随即长度的字串
            StringBuffer tempStringB = new StringBuffer();
            Integer length = r.nextInt(10);
            length = length + 1;
            for(int n=0;n<length;n++){
                int x = (int)(Math.random()*tempLen);
                char  s = (char) temp.charAt(x);
                tempStringB.append(s);
            }
            String tempString = new String(tempStringB);
            stringList.add(tempString);
        }
        System.out.println("------------排序前---------");
        for(String n : stringList){
            System.out.println("当前数据为："+n);
        }
        System.out.println("------------排序后---------");
        Collections.sort(stringList);
        for(String n : stringList){
            System.out.println("当前数据为："+n);
        }
    }

    public static void main(String[] args){
        CollectionSort cs = new CollectionSort();
        //cs.sortTest1();
        //cs.sortTest2();
        cs.sortTest3();

    }
}
