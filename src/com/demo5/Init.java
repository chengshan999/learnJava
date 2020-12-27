package com.demo5;

public class Init {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.perimeter();
        r1.area();

        Circle c1 = new Circle();
        c1.perimeter();
        c1.area();

        IAngle r2 = new Rectangle();
        r2.angleDegrees();

        IAngle t2 = new Triangle();
        t2.angleDegrees();

        IAngle a2 = new IAngle() {
            @Override
            public void angleDegrees() {
                System.out.println("匿名内部类的方式实现接口:");
                System.out.println("多边形的多个角度数总和度数也不同.");
            }
        };
        a2.angleDegrees();
        //匿名内部类的方式实现接口后直接调用方法
        new IAngle() {
            @Override
            public void angleDegrees() {
                System.out.println("匿名内部类的方式实现接口后直接调用方法:");
                System.out.println("多边形的多个角度数总和度数也不同.");
            }
        }.angleDegrees();
    }
}
