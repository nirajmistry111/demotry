package org.example;
import java.time.ZoneId;
import java.util.Date;
import java.util.Calendar;
import java.util.TimeZone;


public class Main {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        Date d = new Date();
        ZoneId z = ZoneId.systemDefault();
        System.out.println(c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(d.getDate());


    }
    public void demo()
    {
        System.out.println("Hello");
    }
    }
