package ex;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 00:52
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        //1.编译时异常 (编译时异常在编译时就会检查, 所以必须写在方法后面进行显示声明)
        try {
            mothed1(sdf, "2024-04-24");
        } catch (ParseException e) {
            System.out.println("时间格式不正确");
        }

        //2.运行时异常
        int[] arr = new int[5];
        String str = null;
        mothed2(arr, str);
    }

    private static void mothed1(SimpleDateFormat sdf, String strDate) throws ParseException {
        //1.编译时异常, 捕获时间解析异常
        //父类: Exception
        //子类: ParseException
        System.out.println(sdf.parse(strDate));
    }

    private static void mothed2(int[] arr, String str) throws RuntimeException {
        //2.运行时异常
        //子类: ArrayIndexOutOfBoundsException
        //     NullPointerException
        //父类: RuntimeException
        System.out.println(str.length() + arr[arr.length]);
    }

}
