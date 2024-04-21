package io.github.ethanliu6.set;

import java.util.LinkedHashSet;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 21:10
 * @Project JavaCode_SE_Advance
 * @Theme LinkedHashSet
 */
public class LinkedHashSetDemo1 {
    //验证: 获取元素顺序
    public static void main(String[] args) {
        //创建集合对象
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("Qiu");
        linkedHashSet.add("Ethan");
        linkedHashSet.add("Qiu");
        linkedHashSet.add("Liu");

        for (String s : linkedHashSet) {
            System.out.println(s);
        }
    }
}