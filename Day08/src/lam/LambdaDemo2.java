package lam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 22:15
 * @Project JavaCode_SE_Advance
 * @Theme 使用Collections对List排序, 要求使用比较器实现降序,用Lambda简化
 */
public class LambdaDemo2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 6, 2, 4, 8);

        //1.之前写法
//        Collections.sort(list, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer n1, Integer n2) {
//                return n2 - n1;
//            }
//        });

        //2.使用Lambda表达式
        Collections.sort(list, (Integer n1, Integer n2) -> {
            return n2 - n1;
        });

        System.out.println(list);
    }
}
