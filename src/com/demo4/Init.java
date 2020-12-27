package com.demo4;

public class Init {
    public static void main(String[] args){
        /*Traffic traffic = new Traffic();
        Traffic bus = new Bus();
        Traffic ship = new Ship();
        Traffic plane = new Plane();
        //Plane pl = new Traffic();//反例！多态不可以用子类型实例化父类

        traffic.zaiKe();
        bus.zaiKe();
        ship.zaiKe();
        plane.zaiKe();*/

        Bus bus = new Bus();
        Traffic traffic = bus;//自动类型提升，系统自动转换(小类型转大类型)
        if(traffic instanceof Bus){
            Bus bus2 = (Bus)traffic;//向下类型转换，强制类型转换(大类型转小类型)
            System.out.println("类型转换成功");
        }else{
            System.out.println("无法进行类型转换,转换成Bus类型");
        }

        Traffic traffic1 = new Traffic();
        if(traffic1 instanceof Ship){
            Ship ship = (Ship)traffic1;//向下类型转换，强制类型转换(大类型转小类型)
            System.out.println("类型转换成功");
        }else{
            System.out.println("无法进行类型转换,转换成Ship类型");
        }

        Ship ship1 = new Ship();
        if(ship1 instanceof Traffic){
            Traffic traffic2 = (Traffic)ship1;//小类型转大类型可以
            System.out.println("类型转换成功");
        }else{
            System.out.println("无法进行类型转换,转换成Ship类型");
        }



    }
}
