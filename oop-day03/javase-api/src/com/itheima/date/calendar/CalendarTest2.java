package com.itheima.date.calendar;

import java.util.Calendar;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/5 11:18
 * @Project JavaCode_SE_Advance
 * @Theme DATE
 */
public class CalendarTest2 {
    // 设置时间日期
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, 2024);
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);

    }
}
