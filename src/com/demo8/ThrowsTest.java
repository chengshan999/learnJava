package com.demo8;

public class ThrowsTest {

    public void test1 (int a,int b) throws DrunkExcaption{
        if(b==0){
            throw new DrunkExcaption("除数不能为0！");
        }else{
            System.out.println("相除的结果为："+a/b);
        }
    }
    public void test2() throws DrunkExcaption{
        throw new DrunkExcaption("不能喝！酒量差");
    }
    public void test3() throws DrunkExcaption{
        try{
            test2();
        }catch(DrunkExcaption e){
            RuntimeException re = new RuntimeException();
            re.initCause(e);
            throw new DrunkExcaption("喝多了又难受！");
        }
    }

    public static void main(String[] args){
        ThrowsTest tt = new ThrowsTest();
        /*try{
            tt.test1(2,0);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }*/
        /*try{
            tt.test2();
        }catch(DrunkExcaption e){
            System.out.println(e.getMessage());
        }*/
        try{//转接异常
            tt.test3();
        }catch(DrunkExcaption e){
            System.out.println(e.getMessage());
        }
    }
}
