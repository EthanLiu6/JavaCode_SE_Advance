package io.github.ethanliu6.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 18:19
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); //体现多态
        list.add(123);
        list.add(234);
        list.add(654);
        list.add(123);

        System.out.println(list);
        System.out.println(list);

    }
}
