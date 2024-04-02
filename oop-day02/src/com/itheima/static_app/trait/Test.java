package com.itheima.static_app.trait;

public class Test {
    public static void main(String[] args) {
        StaticDemo demo1 = new StaticDemo();
        StaticDemo demo2 = new StaticDemo();
        StaticDemo demo3 = new StaticDemo();
        demo1.age ++;
        demo2.age ++;
        demo3.age ++;
        System.out.println(StaticDemo.age);

    }
}
