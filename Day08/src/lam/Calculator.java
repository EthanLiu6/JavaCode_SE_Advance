package lam;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/26 00:23
 * @Project JavaCode_SE_Advance
 * @Theme 代参数与返回值的接口方法
 */
//函数式接口(计算器)
@FunctionalInterface
public interface Calculator {
    public abstract int calculator(int n1, int n2);
}
