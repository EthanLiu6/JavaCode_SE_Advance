package stream_demo;

import java.util.*;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/26 20:45
 * @Project JavaCode_SE_Advance
 * @Theme Stream流 获取方法
 */
public class StreamDemo1 {
    public static void main(String[] args) {
        // 单列集合的获取
        method1();

        // 双列集合的获取
        System.out.println();
        method2();

        // 数组获取
        System.out.println();
        method3();

    }

    private static void method2() {
        //注意,双列集合需要用特有方法
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java基础");
        map.put(2, "Java进阶");
        map.put(3, "MySQL");
        map.put(4, "JavaWeb");
        map.put(5, "Spring");
        map.entrySet().stream().forEach(s -> System.out.print(s + "\t"));
    }

    private static void method1() {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 3, 6, 2, 4, 7, 3);
        list.stream().forEach(s-> System.out.print(s + "\t"));
    }

    private static void method3() {
        int[] arr = {2, 74, 342, 42, 23, 5};
        Arrays.stream(arr).forEach(s -> System.out.print(s + "\t"));
    }

}
