package com.itheima.string;

import java.util.Locale;

public class StringDemo3 {
    /*
    已知字符串，完成右侧需求
    String str = "I Love Java, I Love Heima";
    需求：
    1 计算字符 a 出现的次数（要求使用toCharArray）
    2 计算字符 a 出现的次数（要求使用charAt）
    3 将字符串中所有英文字母变成小写
    4 将字符串中所有英文字母变成大写
    */
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";
        char[] strArr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' == strArr[i]) {
                counter++;
            }
        }
        System.out.println(counter);

        int counter2 = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'){
                counter2 ++;
            }
        }
        System.out.println(counter2);

        System.out.println(str.toLowerCase(Locale.ROOT));

        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
