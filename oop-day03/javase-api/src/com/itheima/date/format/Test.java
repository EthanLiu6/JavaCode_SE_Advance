package com.itheima.date.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/5 10:35
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test {
    public static void main(String[] args) throws ParseException {
//        strTime --> Date
        String strTime = "2023年10月31日 17:00:00";
        method(strTime);
    }

    private static void method(String st) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.parse(st));
    }
}
