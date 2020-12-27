package com.demo10;

public class Package {
    public static void main(String [] args){
        Integer i0 = 257;
        int n = i0;

        System.out.println(i0.equals(257));
        System.out.println(n==257);

        Integer i1 = Integer.valueOf(257);
        int n1 = Integer.parseInt("127");

        Number num = Integer.valueOf(999);
        byte b = num.byteValue();
        short s = num.shortValue();
        int i = num.intValue();
        long l = num.longValue();
        double d = num.doubleValue();
        float f = num.floatValue();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);

        //处理无符号整型
        byte b3 = -1;
        short s3 = -1;
        System.out.println(Byte.toUnsignedInt(b3));
        System.out.println(Short.toUnsignedInt(s3));


    }
}
