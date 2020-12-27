package com.demo;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args){
        //共三个班，每个班四个学生，分别输入12个学生的成绩，求出三个班的平均分
        int classNum = 3;
        int studentNum = 4;
        double sum = 0;
        double svg = 0;
        int score = 0;
        Scanner input = new Scanner(System.in);
        for(var c = 1 ; c <= 3; c++){
            System.out.println("**请输入第"+c+"个班的成绩**");
            sum = 0;
            for(var s = 1 ; s <= 4 ; s++){
                score = 0;
                System.out.println("输入第"+s+"个学生的成绩：");
                score = input.nextInt();
                sum += score;
            }
            System.out.println("第"+c+"个班的总成绩为："+sum);
            svg = sum/studentNum;
            System.out.println("第"+c+"个班的平均分为："+svg);
        }
    }
}
