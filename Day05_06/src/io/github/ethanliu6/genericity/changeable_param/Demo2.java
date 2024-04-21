package io.github.ethanliu6.genericity.changeable_param;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 16:35
 * @Project JavaCode_SE_Advance
 * @Theme 带有泛型的可变参数
 */
public class Demo2 {
    public static void main(String[] args) {
        //生成List集合对象
        List<String> list = new ArrayList<>();

        //带有泛型<String>的可变参数
        Collections.addAll(list, "Java", "MySql", "Ethan", "Qiu");

        System.out.println(list); //[Java, MySql, Ethan, Qiu]
    }
}
