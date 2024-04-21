package io.github.ethanliu6.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 15:24
 * @Project JavaCode_SE_Advance
 * @Theme Comparator接口实现比较器
 */
public class TreeSetDemo4 {
    /*
    按照字符串长度从大到小排序, 长度相同按照字母顺序排序
     */
    public static void main(String[] args) {
        //在创建TreeSet集合时, 制定了排序规则
        TreeSet<String> set = new TreeSet<>(new MyComparator());

        //String类本身具有自然排序规则
        set.add("asdfvd");
        set.add("word");
        set.add("implenemts");
        set.add("myblog");

        System.out.println(set);
    }
}

//创建子类, 实现Comparator接口
class MyComparator implements Comparator<String>{

    //重写compare方法
    @Override
    public int compare(String str1, String str2) {
        //str1: 要存储的字符串数据
        //str2: 已存在的字符串数据
        int res = str2.length() - str1.length();
        if (res == 0){
            res = str1.compareTo(str2);
        }
        return res;
    }
}
