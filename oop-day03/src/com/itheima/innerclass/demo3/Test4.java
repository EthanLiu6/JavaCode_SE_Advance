package com.itheima.innerclass.demo3;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/4 16:02
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test4 {
    public static void main(String[] args) {
    }

    //最为返回值
    public static Flyable getInstance() {
        return new Flyable() {
            @Override
            public void fly() {
                System.out.println("不懂");
            }
        };
    }
}