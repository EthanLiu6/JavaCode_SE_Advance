package io.github.ethanliu6.set;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 20:17
 * @Project JavaCode_SE_Advance
 * @Theme Set集合
 */
public class SetDemo1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Zhu");
        set.add("Ethan");
        set.add("Qiu");
        set.add("Liu");
        set.add("Ethan");

        System.out.println(set);

        for (String s : set) {
            System.out.println(s);
        }
    }
}
