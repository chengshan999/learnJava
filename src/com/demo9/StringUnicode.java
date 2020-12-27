package com.demo9;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringUnicode {
    public static void main(String[] args){
        byte[] b1 = "hello".getBytes(StandardCharsets.UTF_8);
        System.out.println(Arrays.toString(b1));

        String s1 = new String(b1, StandardCharsets.UTF_8);
        System.out.println(s1);
    }
}
