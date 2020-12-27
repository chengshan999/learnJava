package com.demo10;

public class EnumTest {
    public static void main(String[] args){
        Week w6 = Week.SAT;
        System.out.println(w6 == Week.SAT);
        System.out.println("w6 equals Week.SAT : "+ w6.equals(Week.SAT));
        System.out.println(w6.getWeekNum());
        System.out.println(w6.name());

        switch(w6){
            case MON:
            case SEN:
            case WEN:
            case THE:
            case FRI:
                System.out.println("工作日");
            case SAT:
            case SUN:
                System.out.println("休息日");
            default:
                System.out.println("超出限制："+w6.getWeekNum());
        }
    }

}

enum Week{
    SUN(0),MON(1),SEN(2),WEN(3),THE(4),FRI(5),SAT(6);
    protected final int weekNum;
    Week(int num){
        this.weekNum = num;
    }

    public int getWeekNum(){
        return weekNum;
    }
}
