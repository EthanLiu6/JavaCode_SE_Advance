package com.itheima.polymorphic.demo2;

public class Test {
    public static void main(String[] args) {
        // 父类的引用指向子类的对象
        Father f = new Son();

        // 多态对象调用成员变量
        System.out.println(f.num); // num = 100, 调用的是父类中的成员变量

        // 多态对象调用成员方法 // 调用的是子类重写后的方法
        f.show();

        // 多态对象不能调用子类特有的方法
//        f.show2(); // 子类方法
        // 解决方案:向下转型(与强制类型转换一个意思)
        ((Son)f).show2();

    }
}