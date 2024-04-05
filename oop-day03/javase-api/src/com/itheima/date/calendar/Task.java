package com.itheima.date.calendar;

import java.util.Calendar;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/5 11:21
 * @Project JavaCode_SE_Advance
 * @Theme DATE
 */
public class Task {
    // 获取2024年4月4日是星期几?
    public static void main(String[] args) {
        // String -> Date
        Calendar calendar = Calendar.getInstance();
//        String strTime = "2024年4月4日";
        calendar.set(2024, 3, 4);
        int weekDay = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println(weekDay);

        //
    }
}
