package com.itheima.date.baseapp;

import java.util.Date;

public class DateTest {
    //演示：Date对象的使用
    public static void main(String[] args) {
        method1();
//      Fri Apr 05 10:07:16 CST 2024
//      1712282836689

        method2();
//      Fri Apr 05 10:07:16 CST 2024
//      1712282836689
    }

    private static void method1() {
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());
    }

    private static void method2() {
        Date d2 = new Date(1712282836689L); // d2.setTime(1712282836689L)
        System.out.println(d2);

        long time = d2.getTime();
        System.out.println(time); // 获取毫秒值
    }


}
