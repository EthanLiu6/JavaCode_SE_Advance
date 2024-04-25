package lam;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 23:40
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class RandomNumHandlerDemo {
    public static int[] arr = {3, 6, 8, 3, 4}; //仅仅是为了测试带参的接口函数


    public static void main(String[] args) {
        Random random = new Random(); //定义随机数对象
        System.out.println("你的数组为: " + Arrays.toString(arr));


        useRandomNumHander(new RandomNumHandler() {
            @Override
            public int getNumber(int[] arrNum) {
                System.out.print("使用匿名内部类生成的随机数: ");
                return random.nextInt(10);
            }
        });

        useRandomNumHander((arrNum) -> {
            System.out.print("使用Lambda表达式生成的随机数: ");
            return random.nextInt(10);
        });
    }

    private static void useRandomNumHander(RandomNumHandler rdmNumHdr) {
        System.out.println(rdmNumHdr.getNumber(arr));
    }
}
