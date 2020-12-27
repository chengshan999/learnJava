package com.demo;
import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("请输入加分前的分数：");
        int score = input.nextInt();//加分前分数
        int count = 0;//加分次数
        System.out.println("加分前分数：" + score);
        while(score < 60){
            score++;
            count++;
            if(score >= 60){
                System.out.println("加分后分数：" + score);
                System.out.println("加分次数：" + count);
                break;
            }
        }
    }
}
