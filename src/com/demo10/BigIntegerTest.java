package com.demo10;

import java.math.BigInteger;

public class BigIntegerTest {

    public static void main(String[] args){
        BigInteger bi = new BigInteger("123456789123456789");
        System.out.println(bi);
        System.out.println(bi.intValue());
        //System.out.println(bi.intValueExcat());
    }
}
