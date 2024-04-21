package io.github.ethanliu6.map;

import java.util.*;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 20:19
 * @Project JavaCode_SE_Advance
 * @Theme TreeMap集合
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        //创建TreeMap集合对象
        //TreeMap<Student, String> treeMap = new TreeMap<>();
        //重写Comparator接口
        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student stu1, Student stu2) {
                //先按年龄小到大排, 再按字母从小到大排
                int res = stu1.getAge() - stu2.getAge();
                //if(res == 0){
                //    res = stu1.getName().compareTo(stu2.getName());
                //}
                return res == 0 ? stu1.getName().compareTo(stu2.getName()) : res;
            }
        });

        //添加自定义类型元素
        treeMap.put(new Student("Ethan", 21), "甘肃");
        treeMap.put(new Student("QiuZhu", 21), "广西");
        treeMap.put(new Student("aihui", 18), "湖南");
        treeMap.put(new Student("qiu", 17), "广西");
        treeMap.put(new Student("aaa", 28), "四川");
        treeMap.put(new Student("Ethan", 21), "广西"); //去重后这里相当于修改

        //会有ClassCastException异常,需要重写Comparator接口
        //System.out.println(treeMap);

        //使用Map.Entry获取键值对对象
        Set<Map.Entry<Student, String>> entries = treeMap.entrySet();

        //遍历键值对对象
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "\tPlace--" + entry.getValue());
        }
    }
}
