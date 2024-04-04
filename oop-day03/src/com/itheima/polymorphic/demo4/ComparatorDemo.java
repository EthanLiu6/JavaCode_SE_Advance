package com.itheima.polymorphic.demo4;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.polymorphic.demo4
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/31 12 13
 * @Since JDK 17.0
 * @Description
 */
public class ComparatorDemo {
    //对于数组排序
    public static void main(String[] args) {
        Integer[] arr = {2, 0, 2, 2, 3, 4, 0, 0, 4, 0, 2, 6};
        System.out.println("排序前: \n" + Arrays.toString(arr));
        System.out.println();

        //使用Arrays工具类排序
        Arrays.sort(arr);
        System.out.println("排序后: \n" + Arrays.toString(arr));
        System.out.println();

        //使用匿名内部类重写降序排序
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        System.out.println("使用匿名内部类重写倒序排序: \n" + Arrays.toString(arr));

    }
}
