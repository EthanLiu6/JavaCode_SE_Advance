package com.itheima.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    //需求：随机生成10个[0,100]之间的整数，放到整数数组中，按照从小到大的顺序排序并打印元素内容
    public static void main(String[] args) {
        // 需求1: 数组
        int[] arr = new int[10];

        //需求2: 随机数
        Random rd = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rd.nextInt(101);
            arr[i] = num;
            }

        //需求3: 排序
//        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        //打印
        System.out.println(Arrays.toString(arr));


    }
}
