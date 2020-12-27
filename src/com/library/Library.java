package com.library;

import java.util.Scanner;

public class Library {
    private static String[] books = {"高等数学","C#","JAVA基础","C语言","计算机导论"};
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("请输入指令确定选书方式：1 图书下标；2 图书名称搜索；");
        int sign;
        try{
            try{
                sign = console.nextInt();
                if(sign != 1 && sign != 2){
                    throw new Exception("选书方式选择错误");
                }
            }catch(Exception e){
                throw new Exception(e.getMessage());
            }
            String book;
            switch(sign){
                case 1:
                    book = getBookByNum();
                    System.out.println("选取的书籍名称为："+book);
                    break;
                case 2:
                    book = getBookByName();
                    System.out.println("选取的书籍名称为："+book);
                    break;
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
    private static String getBookByNum() throws Exception{
        try{
            System.out.println("请输入图书下标：");
            int index = console.nextInt();
            String book = books[index];
            return book;
        }catch(Exception e){
            Exception newE = new Exception("图书下标错误！");
            newE.initCause(e);
            throw newE;
        }
    }

    private static String getBookByName() throws Exception{
        System.out.println("请输入图书名称：");
        String bookName = console.next();
        for(int i = 0 ; i < books.length ; i++){
            if(bookName.equals(books[i])){
                return books[i];
            }
        }
        throw new Exception("输入的书名不存在");
    }
}
