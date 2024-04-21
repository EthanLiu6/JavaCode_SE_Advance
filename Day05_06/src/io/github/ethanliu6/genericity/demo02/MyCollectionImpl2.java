package io.github.ethanliu6.genericity.demo02;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/19 20:40
 * @Project JavaCode_SE_Advance
 * @Theme 情况2：在子类编写时，没有指定接口上泛型的具体类型，
 *              意味着：子类也使用了跟泛型接口同样的泛型
 *              子类 --> 泛型类
 */
public class MyCollectionImpl2<E> implements MyCollection<E>{
    public void add(E e){

    }

}
