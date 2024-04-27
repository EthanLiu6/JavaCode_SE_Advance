package stream_demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/27 10:27
 * @Project JavaCode_SE_Advance
 * @Theme 收集方法
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        //针对集合
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        list = list.stream()
                .filter(num -> num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(list);

        //针对数组
        Integer[] arr = list.stream()
                .filter(num -> num % 2 == 0)
                .toArray(num->new Integer[num]);

        System.out.println(Arrays.toString(arr));
    }
}
