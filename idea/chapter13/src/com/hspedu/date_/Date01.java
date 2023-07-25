package com.hspedu.date_;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Date01 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println("当前日期" + d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前日期" + format);
    }
}
