package io.github.ethanliu6.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 18:58
 * @Project JavaCode_SE_Advance
 * @Theme Map集合
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("文章", "马伊琍");
        map.put("谢霆锋", "王菲");
        map.put("李亚鹏", "王菲");

        System.out.println(map);
    }
}
