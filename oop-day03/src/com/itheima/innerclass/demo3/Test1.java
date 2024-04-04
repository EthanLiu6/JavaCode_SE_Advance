package com.itheima.innerclass.demo3;

public class Test1 {
    public static void main(String[] args) {
        new Flyable() {
            @Override
            public void fly() {
                System.out.println("灰灰在学习");
            }
        }.fly();
    }
}
