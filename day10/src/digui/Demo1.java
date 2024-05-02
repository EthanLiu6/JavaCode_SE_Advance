package digui;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/29 23:26
 * @Project JavaCode_SE_Advance
 * @Theme 递归案例
 */
public class Demo1 {
    public static void main(String[] args) {
        int x = 16;
        System.out.println(factorial(x));
    }

    /**
     * 用于计算整数阶乘
     * @param x 整数x
     * @return x的阶乘
     */
    private static int factorial(int x) {
        if (x == 1 || x == 0){
            return 1;
        }
        return x * factorial(x - 1);
    }
}
