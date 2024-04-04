package com.itheima.polymorphic.demo1;

public class Test {
    public static void main(String[] args) {
        Animal an = new Cat(); //多态的体现, 用父类的引用 + 子类的对象
        an.eat(); //调用的是子类重写的方法

    }
}
