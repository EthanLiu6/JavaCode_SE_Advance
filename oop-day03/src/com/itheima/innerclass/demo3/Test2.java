package com.itheima.innerclass.demo3;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/4 15:03
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test2 {
    public static void main(String[] args) {
        // 父类引用, 重写对象作为子类对象
        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("灰灰飞飞飞");
            }
        };
        flyable.fly();
        flyable.fly();
    }
}
