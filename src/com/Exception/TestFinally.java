package com.Exception;

public class TestFinally {
    public static void main(String[] args){
        TestFinally t = new TestFinally();
        System.out.println(t.test1());
    }

    String test1(){
        try{
            return "try";
        }catch(Exception e){
            return "catch";
        }finally{
            return "finally";
        }
    }
}
