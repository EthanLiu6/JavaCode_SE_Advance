package com.itheima.system;

public class SystemTest {
    //演示：System类的使用
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        method();
        long end = System.currentTimeMillis();
        System.out.println("执行时间: " + (end - start) + "毫秒");
    }

    private static void method() {
        int count = 0;
        for (int i = 0; i < 12304567; i++) {
            if ((i % 2) == 0){
                count ++;
            }
        }
    }
}
