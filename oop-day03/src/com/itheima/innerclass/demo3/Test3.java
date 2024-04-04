package com.itheima.innerclass.demo3;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/4 15:10
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test3 {
    public static void main(String[] args) {

    }

    //匿名内部类当作方法的参数使用
    public static void showFly(Flyable flyable) {
        showFly(new Flyable() {
            @Override
            public void fly() {
                System.out.println("灰灰飞飞飞");
            }
        });
    }
}

