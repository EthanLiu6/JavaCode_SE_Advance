package io.github.ethanliu6.set;

import java.util.TreeSet;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 00:07
 * @Project JavaCode_SE_Advance
 * @Theme TreeSet集合
 */
public class TreeSetDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Integer> treeSet = new TreeSet<>();

        //添加元素
        treeSet.add(123);
        treeSet.add(13);
        treeSet.add(143);
        treeSet.add(183);
        treeSet.add(3);

        //所存储元素会按照规则进行排序
        System.out.println(treeSet);
    }
}
