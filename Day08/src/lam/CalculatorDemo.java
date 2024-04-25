package lam;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/26 00:26
 * @Project JavaCode_SE_Advance
 * @Theme 带参数与返回值的Lambda
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        addNum((int n1, int n2) -> {
            return n1 + n2;
        });
    }

    private static void addNum(Calculator calculator) {
        int res = calculator.calculator(10, 20);
        System.out.println(res);

    }
}
