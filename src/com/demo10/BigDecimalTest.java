package com.demo10;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args){
        BigDecimal bd1 = new BigDecimal("1234567891234.56789");
        BigDecimal bd2 = new BigDecimal("1234567891234.5678900");
        System.out.println(bd1);
        System.out.println(bd2);
        System.out.println(bd1.scale());
        System.out.println(bd2.scale());
        System.out.println(bd1.equals(bd2));
        System.out.println(bd1.compareTo(bd2));//整数：大于；0 等于；负数：小于

    }
}
