package com.itheima.static_app.trait;

/*
    1.静态方法中只能访问静态成员
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(++StaticDemo.age);
        StaticDemo.myPrint();
        show();
        StaticDemo demo = new StaticDemo();
        demo.myPrint2();
    }

    public static void show() {
        System.out.println("show");
    }
}
