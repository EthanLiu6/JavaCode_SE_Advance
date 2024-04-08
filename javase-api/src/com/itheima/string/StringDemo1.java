package com.itheima.string;

public class StringDemo1 {
    /*
    已知字符串，完成需求
    String str = "I Love QiuZhu, I Love Ethan";
    判断是否存在  “Qiu”
    判断是否以Ethan字符串结尾
    判断是否以QiuZhu开头
    判断 Zhu在字符串中的第一次出现位置
    判断  itcast 所在的位置
    */
    public static void main(String[] args) {
        String str = "I Love QiuZhu, I Love Ethan";
        System.out.println(str.contains("Qiu"));
        System.out.println(str.endsWith("Ethan"));
        System.out.println(str.startsWith("QiuZhu"));
        System.out.println(str.indexOf("Zhu"));
        System.out.println(str.indexOf("itcast"));


    }
}
