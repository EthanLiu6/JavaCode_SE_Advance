package com.itheima.polymorphic.demo2;

public class Son extends Father {
    int num = 10;

    public void show() {
        System.out.println("子类的show方法");
    }

    public void show2() {
        System.out.println("子类特有的方法");
    }
}
