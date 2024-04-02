package com.itheima.static_app.trait;

/**
 * 静态的特点：
 * 1、被所在类的所有对象共享
 * 2、随着类的加载而加载，优先于对象存在
 * 3、可以通过类名调用
 */


public class StaticDemo {


    //静态成员变量
    static int age = 19;

    //非静态成员变量
    private String name = "aihui";

    //静态成员方法
    static void myPrint() {
        System.out.println("好好学习!珍惜珠珠!");
    }

    void myPrint2() {
        System.out.println("好好学习!珍惜珠珠!");
    }

    public static void notThis() {
//        System.out.println(this.name);
//        java: 无法从静态上下文中引用非静态 变量 this
    }
}
