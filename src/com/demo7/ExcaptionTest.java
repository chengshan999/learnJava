package com.demo7;

public class ExcaptionTest {

    public static void main(String [] args){
        ExcaptionTest t1 = new ExcaptionTest();
        /*int n1 = t1.test1();
        System.out.println("返回结果是："+n1);*/

        /*int n2 = t1.test2();
        System.out.println("返回结果是："+n2);*/

        int n3 = t1.test3();
        System.out.println("返回结果是："+n3);
    }

    public int test1(){
        int a = 100;
        int result = 100;
        try{
            while(a>-1){
                a--;
                result = result/a;
            }
            System.out.println("循环结束了！");
            return result;
        }catch(Exception e){
            System.out.println("报错了！");
            System.out.println(e.fillInStackTrace());
            return -1;
        }
    }

    public int test2(){
        int a = 100;
        int result = 100;
        try{
            while(a>-1){
                a--;
                result = result/a;
            }
            System.out.println("循环结束了！");
            return result;
        }catch(ArithmeticException e){
            System.out.println("算术报错！");
            System.out.println(e.fillInStackTrace());
            return -1;
        }catch(Exception e){
            System.out.println("报错了！");
            System.out.println(e.fillInStackTrace());
            return -2;
        }
    }

    public int test3(){
        int a = 100;
        int result = 100;
        try{
            while(a>-1){
                a--;
                result = result/a;
            }
            System.out.println("循环结束了！");
            return result;
        }catch(ArithmeticException e){
            System.out.println("算术报错！");
            System.out.println(e.fillInStackTrace());
            return -1;
        }catch(Exception e){
            System.out.println("报错了！");
            System.out.println(e.fillInStackTrace());
            return -2;
        }finally{
            System.out.println("最后finally输出！");
            return -3;
        }
    }
}
