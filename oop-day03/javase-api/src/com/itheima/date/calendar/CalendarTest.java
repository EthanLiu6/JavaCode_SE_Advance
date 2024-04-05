package com.itheima.date.calendar;

import java.util.Calendar;

public class CalendarTest {
    //演示：Calendar日历类的使用
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); //抽象类静态方法用类名调用
//        System.out.println(calendar);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);

        System.out.println(year + "年" + (month + 1) + "月" + day + "日");
        System.out.println(hour + ":" + minute + ":" + second);

    }
}
