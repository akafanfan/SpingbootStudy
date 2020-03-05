package com.fan.sb2.initializer;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        String s = Long.toString(l);
        System.out.println(s);
        System.out.println(s.length());
    }

}
