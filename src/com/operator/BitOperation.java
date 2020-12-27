package com.operator;

public class BitOperation {
    public static void main(String[] args){
        //位运算符
        //与运算 &
        int a = 1 & 1;
        //两个都为1，则与运算结果为1，否则结果为0
        System.out.println("1 & 1 = "+a);//1
        a = 1 & 0;
        System.out.println("1 & 0 = "+a);//0
        a = 0 & 1;
        System.out.println("0 & 1 = "+a);//0
        a = 0 & 0;
        System.out.println("0 & 0 = "+a);//0

        //或运算 |
        //两个有一个为1，则或运算结果为1，两个都为0，则结果为0
        a = 1 | 1;
        System.out.println("1 | 1 = "+a);//1
        a = 1 | 0;
        System.out.println("1 | 0 = "+a);//1
        a = 0 | 1;
        System.out.println("0 | 1 = "+a);//1
        a = 0 | 0;
        System.out.println("0 | 0 = "+a);//0

        //异或运算 ^
        //两个不相同，则或运算结果为1，否则结果为0
        a = 1 ^ 1;
        System.out.println("1 ^ 1 = "+a);//0
        a = 1 ^ 0;
        System.out.println("1 ^ 0 = "+a);//1
        a = 0 ^ 1;
        System.out.println("0 ^ 1 = "+a);//1
        a = 0 ^ 0;
        System.out.println("0 ^ 0 = "+a);//0

        //非运算  ~
        //取反，0为1，1为0
        a = ~1;
        System.out.println("~1 = "+a);//0
        a = ~0;
        System.out.println("~0 = "+a);//1

        //对两个整数进行位运算，实际上就是按位对齐，然后依次对每一位进行运算。
        int i = 167776589; // 00001010 00000000 00010001 01001101
        int n = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i & n); // 167776512


        //这样就能解释为什么hashCode能限制为16的的倍数之内的值了（即0-15）
        int hashCode = 167776589;
        int index = hashCode & 0xf; // 0xf = 15
        // 00001010 00000000 00010001 01001101
        // 00000000 00000000 00000000 00000111
        // 与运算结果为：
        // 00000000 00000000 00000000 00000101
        // 十进制结果为：9

    }
}
