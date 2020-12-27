package com.demo3;

public class Telphone {
    public float screen;
    public float cpu;
    public int memory;

    public boolean equals(Object obj){//重写Object类的equals方法
        if(this == obj)//判断两个对象的内存编码是否是同一个
            return true;//如果两个对象的内存编码一致，那就是同一个对象
        if(obj == null)//如果传进来的对象为null，那一定不相等
            return false;
        if(this.getClass() != obj.getClass() )//如果两个对象的类对象不一样，那对象一定不一样
            return false;
        Telphone other = (Telphone) obj;//如果两个对象的类对象一样，那么可以把传入的对象定义为当前类的类型
        if(this.screen != other.screen)//比较同样类型下的值是否相同，如果值也相同，那么俩对象就相同
            return false;
        if(this.cpu != other.cpu)
            return false;
        if(this.memory != other.memory)
            return false;
        return true;
    }
}
