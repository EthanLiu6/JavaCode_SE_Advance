package com.itheima.utils_app;
/*
    1.工具类不能被继承
    2.不能让其他类创建对象
    3.提供静态方法(类名调用)
 */
public final class Num {

    public Num() {
    }

    public static int maxNum(int a, int b){
        return a > b ? a: b;
    }
}
