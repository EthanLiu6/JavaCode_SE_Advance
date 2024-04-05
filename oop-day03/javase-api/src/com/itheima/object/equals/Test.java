package com.itheima.object.equals;

public class Test {
    //演示：equals方法
    public static void main(String[] args) {
        Phone p1 = new Phone("小米", 2999);
        Phone p2 = new Phone("小米", 2999);
        // 查看对象地址值
        System.out.println(p1);
        System.out.println(p2);

        // 使用==判断
        System.out.println( p1 == p2); // false  判断变量用值, 判断对象用地址

        // 使用equals方法
        System.out.println(p1.equals(p2)); // false 内部还是调用==

        // 重写equals方法
        System.out.println(p1.equals(p2)); // true 自带快捷键重写
    }
}
