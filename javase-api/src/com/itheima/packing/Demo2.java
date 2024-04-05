package com.itheima.packing;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/5 16:23
 * @Project JavaCode_SE_Advance
 * @Theme 自动装箱与拆箱 享元设计模式
 */
public class Demo2 {
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 10;

        int num3 = 1000;
        int num4 = 1000;

        System.out.println(num1 == num2);
        System.out.println(num1.equals(num2));

        System.out.println(num3 == num4);
        System.out.println(Integer.hashCode(num3));
    }
}
