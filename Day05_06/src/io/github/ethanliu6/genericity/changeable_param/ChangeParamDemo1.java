package io.github.ethanliu6.genericity.changeable_param;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 16:21
 * @Project JavaCode_SE_Advance
 * @Theme 可变参数
 */
public class ChangeParamDemo1 {
    public static void main(String[] args) {
        int res = numSum("nums", 1, 2, 3, 5, 7);
        System.out.println(res);
    }

    //可变参数只能放在参数列表最后面
    //可变参数本质就是数组, 所以方法重载上不能够用数组格式写相同的, 如下面的int... 就不能再出现int[];
    public static int numSum(String sNum, int... nums) {
        int sum = 0;

        //把可变参数当作数组使用
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return sum;
    }
}
