package io.github.ethanliu6.genericity.demo02;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/19 20:42
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test1 {
    public static void main(String[] args) {
        MyCollectionImpl1 myCollectionImpl1 = new MyCollectionImpl1();
        myCollectionImpl1.add("Ethan");

        MyCollectionImpl2<Integer> myCollectionImpl2 = new MyCollectionImpl2();
        myCollectionImpl2.add(8888);
    }
}
