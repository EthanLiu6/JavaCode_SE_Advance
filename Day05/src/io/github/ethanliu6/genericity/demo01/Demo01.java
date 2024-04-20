package io.github.ethanliu6.genericity.demo01;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/19 18:32
 * @Project JavaCode_SE_Advance
 * @Theme 泛型
 */
public class Demo01 {
    public static void main(String[] args) {
        GenericityClass<String> gc1 = new GenericityClass<>(); //5版本后可以在后面不添加类型
        gc1.setObj("Ethan Love Qiu");
        System.out.println(gc1.getObj());

        GenericityClass<Integer> gc2 = new GenericityClass<>();
        gc2.setObj(8888);
        System.out.println(gc2.getObj());

    }
}

// 当不确定属类中某个属性类型时，可以使用泛型表示
class GenericityClass<T> {
    private T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
