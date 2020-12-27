package com.date;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest {

    public static void main(String[] args){
        Calendar c1 = Calendar.getInstance();

        System.out.println(Calendar.YEAR);
        System.out.println(c1.get(Calendar.YEAR));
        System.out.println("");

        System.out.println(Calendar.MONTH);
        System.out.println(c1.get(Calendar.MONTH)+1);
        System.out.println("");

        System.out.println(Calendar.DAY_OF_MONTH);
        System.out.println(c1.get(Calendar.DAY_OF_MONTH));
        System.out.println("");

        System.out.println(Calendar.HOUR_OF_DAY);
        System.out.println(c1.get(Calendar.HOUR_OF_DAY));
        System.out.println("");

        System.out.println(Calendar.MINUTE);
        System.out.println(c1.get(Calendar.MINUTE));
        System.out.println("");

        System.out.println(Calendar.SECOND);
        System.out.println(c1.get(Calendar.SECOND));
        System.out.println("");

        System.out.println(c1.getTime());
        System.out.println("");

        System.out.println(c1.getTimeInMillis());
        System.out.println("");
    }
}
