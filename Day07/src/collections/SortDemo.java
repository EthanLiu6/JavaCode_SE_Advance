package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/23 09:55
 * @Project JavaCode_SE_Advance
 * @Theme 使用Collections工具类实现List集合的排序
 */
public class SortDemo {
    public static void main(String[] args) {
        //创建List集合对象并指定元素类型为整型
        List<Integer> list = new ArrayList<>();

        //使用Collections工具类给集合添加元素
        Collections.addAll(list, 4, 1, 6, 3, 7, 5, 2);
        System.out.println("排序前:" + list); //排序前:[4, 1, 6, 3, 7, 5, 2]

        //使用Collections工具类实现排序(确保元素具有自然排序)
        Collections.sort(list);
        System.out.println("默认排序后:" + list); //默认排序后:[1, 2, 3, 4, 5, 6, 7]

        //重写排序规则(小--->大), 注意写法规则
        //对与自定义对象, 要求自定义对象具备自然排序或者实现比较器
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer n1, Integer n2) {
                return n2 - n1;
            }
        });
        System.out.println("重写规则排序(小-->大):" + list); //重写规则排序(小-->大):[7, 6, 5, 4, 3, 2, 1]
    }
}
