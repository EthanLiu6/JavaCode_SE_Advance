package com.itheima.polymorphic.demo5;

import java.util.Date;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.polymorphic.demo5
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/31 15 22
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("小洪",18);
        Student stu2 = new Student("小东",20);
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu1.equals(stu2));

        System.out.println(System.currentTimeMillis());

    }
}
