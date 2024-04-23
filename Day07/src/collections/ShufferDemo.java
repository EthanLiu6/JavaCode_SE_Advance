package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/23 09:51
 * @Project JavaCode_SE_Advance
 * @Theme Collections工具类实现List集合洗牌
 */
public class ShufferDemo {
    public static void main(String[] args) {
        //创建List集合对象并指定元素类型为整型
        List<Integer> list = new ArrayList<>();

        //使用Collections工具类给集合添加元素
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7);
        System.out.println("原始值:" + list); //原始值:[1, 2, 3, 4, 5, 6, 7]

        //使用Collections工具类实现洗牌(打乱)
        Collections.shuffle(list);
        System.out.println("打乱后:" + list); //打乱后:[4, 1, 6, 3, 7, 5, 2]

    }
}
