package com.demo9;

import java.util.Arrays;

public class StringFunction {
    public static void main(String[] args){
        String s1 = "hello";
        //contains
        System.out.println(s1.contains("ll"));
        //indexOf
        System.out.println(s1.indexOf("l"));
        //lastIndexOf
        System.out.println(s1.lastIndexOf("l"));
        //startsWith
        System.out.println(s1.startsWith("he"));
        //endsWith
        System.out.println(s1.endsWith("lo"));
        //substring

        System.out.print(s1.substring(2,4));
        System.out.println("");
        System.out.print("|");
        String s2 = " \r\nhello \r\n";
        System.out.println(s2);
        System.out.print("|");
        System.out.println("");
        //trim
        System.out.println(s2.trim());
        //strip
        System.out.println("");
        System.out.print("|");
        String s3 = " \r\n\u3000hello \r\n\u3000";
        System.out.println(s3.trim());
        System.out.print("|");
        System.out.println("");
        System.out.println(s3.strip());
        System.out.println(s3.stripLeading());
        System.out.println(s3.stripTrailing());
        //isEmpty
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        //isBlank
        System.out.println("".isBlank());
        System.out.println(" \n".isBlank());
        System.out.println(" hello ".isBlank());
        //replace
        System.out.println(s1.replace("l","**"));
        //replaceAll
        System.out.println("A,,B;C D".replaceAll("[\\,\\;\\s]+"," "));
        //split
        String s4 = "h,e,l,l,o";
        String [] c = s4.split(",");
        System.out.println(Arrays.toString(c));
        //join
        String s = String.join("*",c);
        System.out.println(s);
        //format
        String s5 = "My name is %s,I'm %d!I have $%.2f";
        System.out.println(String.format(s5,"li lei",26,59.5));
        //formatted
        //System.out.println(s5.formatted("li lei",26,59.5));//J13之后才支持
    }
}
