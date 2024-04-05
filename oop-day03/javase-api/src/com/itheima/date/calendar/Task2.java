package com.itheima.date.calendar;

import java.util.Calendar;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/5 11:32
 * @Project JavaCode_SE_Advance
 * @Theme DATE
 */
public class Task2 {
    // 计算10000天之后的年月日
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 10000);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH) + 1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }
}
