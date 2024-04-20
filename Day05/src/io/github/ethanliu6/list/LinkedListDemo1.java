package io.github.ethanliu6.list;

import java.util.LinkedList;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 19:54
 * @Project JavaCode_SE_Advance
 * @Theme 链表
 */
public class LinkedListDemo1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(123);
        list.add(1, 234); //这里的索引并非真实的索引,而是为了计算数据size来指定的
        list.add(345);
        list.add(345);

        System.out.println(list);
    }
}
