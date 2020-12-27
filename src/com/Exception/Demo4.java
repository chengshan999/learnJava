package com.Exception;

public class Demo4 {
    public static void main(String[] args){
        try{
            process1();
        }catch(Exception e){
            if(e.getCause() == null){
                e.printStackTrace();
            }
        }
    }
    public static void  process1(){
        try{
            process2();
        }catch(NumberFormatException e){
            if(e.getCause() == null){
                throw new RuntimeException(e);
            }
            e.printStackTrace();
        }
    }
    public static void  process2(){
        try{
            Integer.parseInt("abc");
        }catch(NumberFormatException e){
            if(e.getCause() == null){
                e.printStackTrace();
            }
        }
    }
}
