package stream_demo;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/26 21:35
 * @Project JavaCode_SE_Advance
 * @Theme Stream流 中间方法
 */


/*
    Stream流中三类方法之一 :  中间方法

    1 Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
        Predicate接口中的方法 : boolean test(T t)：对给定的参数进行判断，返回一个布尔值
    2 Stream<T> limit(long maxSize)：截取指定参数个数的数据
    3 Stream<T> skip(long n)：跳过指定参数个数的数据
    4 static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流
    5 Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法)
    6 Stream<T> sorted () : 将流中元素按照自然排序的规则排序
    7 Stream<T> sorted (Comparator<? super T> comparator) : 将流中元素按照自定义比较器规则排序

 */
public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("张翠山");
        list.add("张三丰");
        list.add("谢广坤");
        list.add("谢广坤");
        list.add("赵四");
        list.add("刘能");
        list.add("小沈阳");
        list.add("张良");
        list.add("张良");

        list.stream()
                .filter(s->s.startsWith("谢")) //筛选器, 按照条件筛选
                .forEach(s-> System.out.println(s));
        System.out.println();
        list.stream().limit(5).forEach(s-> System.out.println(s)); //只筛选限制的前n个
        System.out.println();
        list.stream().skip(3).forEach(s-> System.out.println(s)); //跳过前n个
        System.out.println();
        list.stream().distinct().forEach(s-> System.out.println(s)); //去重
        System.out.println();
        list.stream().sorted().forEach(s -> System.out.println(s)); //自然排序
        System.out.println();
        list.stream()
                .sorted((str1, str2)-> str1.length() - str2.length()) //重写的Lambda比较器
                .forEach(s -> System.out.println(s));

        //回顾往期比较器
//        list.stream().sorted(new Comparator<String>() {
//            @Override
//            public int compare(String str1, String str2) {
//                int res = str1.length() - str2.length();
//                if (res == 0){
//                    res = str1.compareTo(str2);
//                }
//                return res;
//            }
//        });

    }
}
