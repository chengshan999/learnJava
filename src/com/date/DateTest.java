package com.date;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/*
* Date类和SimpleDateFormat类
* */
public class DateTest {
    public static void main(String[] args) throws ParseException{
        Date now = new Date();
        System.out.println(now);
        System.out.println("");

        SimpleDateFormat  sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat  sdf2 = new SimpleDateFormat("yyyy/MM/dd HH:mm");
        SimpleDateFormat  sdf3 = new SimpleDateFormat("yyyy年MM月dd HH:mm:ss");

        String str1 =sdf1.format(now);
        String str2 =sdf2.format(now);
        String str3 =sdf3.format(now);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println("");

        String strDate = "2020年01月01日 00:00:00";

        SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d1 = sdf4.parse(strDate);

        System.out.println(strDate);
        System.out.println(d1);
    }
}
