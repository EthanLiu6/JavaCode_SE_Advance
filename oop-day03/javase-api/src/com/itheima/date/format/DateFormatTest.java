package com.itheima.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatTest {
    //演示：日期格式化、日期解析
    public static void main(String[] args) throws ParseException {

        // 日期格式化(format)
        method1();
//      Fri Apr 05 10:24:36 CST 2024
//      2024 年4月5日 10:24:36

        // 日期解析(parse)
        String srtTime = "2024年4月5日 10:26:16";
        method2(srtTime);
//      Fri Apr 05 10:26:16 CST 2024
    }

    private static void method2(String st) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 HH:mm:ss");
        System.out.println(sdf.parse(st));

    }

    private static void method1() {
        Date d1 = new Date();
        System.out.println(d1);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 HH:mm:ss");
        System.out.println(sdf.format(d1));
    }

}
