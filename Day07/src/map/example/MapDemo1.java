package map.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/22 21:58
 * @Project JavaCode_SE_Advance
 * @Theme 使用Map集合统计字符串中每个字符出现的次数
 */
public class MapDemo1 {
    //统计字符串中每个字符出现的次数
    //"ethanliuloveqiu"
    //a(1)  q(1)  t(1)  e(2)  u(2)  v(1)  h(1)  i(2)  l(2)  n(1)  o(1)

    public static void main(String[] args) {
        //字符串
        String strs = "ethanliuloveqiu";

        //统计字符次数
        //初始化哈希表对象
        Map<Character, Integer> recordMap = new HashMap<>();

        //遍历字符串
        for (int i = 0; i < strs.length(); i++) {
            //取出对应字符
            char strChar = strs.charAt(i); // String类的charAt()方法

            //判断字符串是否存在
            if (recordMap.containsKey(strChar)) {
                //2.存在: 通过该字符的key找value, 对value + 1, 将结果重新写入对应的key和value (修改)
                recordMap.put(strChar, recordMap.get(strChar) + 1);
            } else {
                //1.不存在: 将该字符作为key, 并初始化对应的value为1
                recordMap.put(strChar, 1);
            }
        }

        //System.out.println(recordMap);
        //遍历Map集合设置输出格式 (Map遍历方式2)
        Set<Map.Entry<Character, Integer>> entries = recordMap.entrySet(); //定义键值对对象的Set集合对象
        for (Map.Entry<Character, Integer> entry : entries) { //增强for遍历键值对
            char key = entry.getKey(); //单个键值对取键
            int value = entry.getValue(); //单个键值对取值
            System.out.print(key + "(" + value + ")  ");
        }
    }
}
