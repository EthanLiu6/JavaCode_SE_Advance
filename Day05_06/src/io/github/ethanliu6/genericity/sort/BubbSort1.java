package io.github.ethanliu6.genericity.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 16:57
 * @Project JavaCode_SE_Advance
 * @Theme 冒泡排序
 */
public class BubbSort1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //使用泛型可变参数添加集合数据
//        Collections.addAll(list, 4, 6, 2, 8, 1, 5, 9, 4, 3);
        Collections.addAll(list, 1, 2, 3, 4, 5, 5, 9, 4, 3);
        System.out.println("排序前:" + list);
        bullSort(list);
        System.out.println("排序后:" + list);
    }

    //冒泡排序算法
    public static List<Integer> bullSort(List<Integer> list) {

        if (list.size() == 0) {
            return list;
        }
        for (int i = 0; i < list.size() - 1; i++) { //轮次
            //优化
            boolean flag = false; //记录排序后状态
            for (int j = 0; j < list.size() - i - 1; j++) { //每轮比较对象
                if (list.get(j) > list.get(j + 1)) { //相邻数据进行比较
                    int temp = list.get(j + 1);
                    list.set(j + 1, list.get(j));
                    list.set(j, temp);
                    flag = true; //说明发生过变化
                }
            }
            // 如果一轮比较中没有发生交换，说明已经排序完成
            if (!flag) {
                break;
            }
        }
        return list;
    }
}

