package io.github.ethanliu6.genericity.demo03;

import java.util.ArrayList;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 17:13
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test1 {
    public static void main(String[] args) {
        ArrayList<? extends Person> people = new ArrayList<>(); //泛型上限
    }

    public static void method(ArrayList<? extends Person> E){
//        E.add(new Worker());
//        E.add(new Student());

    }
}
