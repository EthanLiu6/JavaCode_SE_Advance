package io.github.ethanliu6.genericity.demo02;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/19 20:32
 * @Project JavaCode_SE_Advance
 * @Theme 泛型接口
 */
// 当不确定接口中某个方法参数使用什么类型
// 或者方法返回值类型时，可以使用泛型表示
public interface MyCollection<E> {
    void add(E param);
}
