package com.demo10;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class MathTest {
    private static Object SecureRandom;

    public static void main(String[] args){
        //常用数学类静态方法
        //abs
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-7.8));
        //max,min
        System.out.println(Math.min(5,11));
        System.out.println(Math.max(5,11));
        //pow
        System.out.println(Math.pow(10,3));
        //sqrt
        System.out.println(Math.sqrt(100));
        //exp
        System.out.println(Math.exp(3));
        //log
        System.out.println(Math.log(4));
        //三角函数
        System.out.println(Math.sin(3.14));
        //两个常量π和e
        System.out.println(Math.PI);
        System.out.println(Math.E);
        //生成随机数 范围0<= x<1
        System.out.println(Math.random());

        //Random伪随机数类及其方法nextInt(),nextFloat(),nextDouble(),nextDouble(),nextLong()
        System.out.println("Random伪随机数");
        System.out.println("没有指定种子，两次随机结果不同");
        Random r = new Random();
        System.out.println(r.nextInt());//没有指定种子，两次随机结果不同
        System.out.println(r.nextInt());//没有指定种子，两次随机结果不同
        System.out.println(r.nextInt(10));
        System.out.println(r.nextInt(10));
        System.out.println("指定了种子，两次随机结果相同");
        Random r1 = new Random(100);
        System.out.println(r1.nextInt());//指定了种子，两次随机结果相同
        System.out.println(r1.nextInt());//指定了种子，两次随机结果相同
        System.out.println(r1.nextInt(10));//重新指定范围，随机数又不同了？？
        System.out.println(r1.nextInt(10));
        //SecureRandom安全随机数类
        System.out.println("SecureRandom安全随机数类");
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt());
        System.out.println(sr.nextInt(10));
        System.out.println(sr.nextInt(100));

        SecureRandom sr1 = null;
        try{
            sr1 = sr.getInstanceStrong();//获取高强度安全随即生成器
        }catch(Exception e){
            sr1 = new SecureRandom();
        }
        byte[] b = new byte[10];
        sr1.nextBytes(b);
        System.out.println(Arrays.toString(b));

    }
}
