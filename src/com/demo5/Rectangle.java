package com.demo5;

public class Rectangle extends Shape implements IAngle {
    public void perimeter(){
        System.out.println("矩形的周长是2*（长+宽）");
    }
    public void area(){
        System.out.println("矩形的面积是长*宽");
    }
    public void angleDegrees(){
        System.out.println("矩形的四个角度数总和为360度");
    }
}
