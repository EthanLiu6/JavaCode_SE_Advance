package io.github.ethanliu6.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 19:11
 * @Project JavaCode_SE_Advance
 * @Theme 遍历键去找值
 */
public class MapDemo2 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String, String> map = new HashMap<>();

        //添加集合中的元素
        map.put("爱辉", "珠珠");
        map.put("小刚", "小卢");
        map.put("小谭", "不认识");
        map.put("阿子", "没有");

        //遍历键去找值
        Set<String> keys = map.keySet();  // 获取集合所有key
        for (String key : keys) {
            System.out.println("Key=" + key + "\t Values=" + map.get(key) /* 键找值 */);
        }
    }
}
