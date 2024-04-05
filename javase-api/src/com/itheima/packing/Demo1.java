package com.itheima.packing;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/5 15:54
 * @Project JavaCode_SE_Advance
 * @Theme 包装类: String与其他类型之间的转换
 */
public class Demo1 {
    public static void main(String[] args) {
        // Others ---> String
        int num1 = 10;
        String sNum1 = num1 + "";
        System.out.println(sNum1);
        System.out.println(String.valueOf(num1));

        // String ---> Others
        String sInt = "2100000000";
        int num2 = Integer.parseInt(sInt);
        System.out.println(num2);

        String sBool = "true";
        Boolean bool = Boolean.parseBoolean(sBool);
        System.out.println(bool);

        String sDouble = "12.43";
        System.out.println(Double.parseDouble(sDouble));

        String sLong = "21000000000000";
        System.out.println(Long.parseLong(sLong));

        String sFloat = "123.432";
        System.out.println(Float.parseFloat(sFloat));

        String sShort = "32767";
        System.out.println(Short.parseShort(sShort));

        String sByte = "127";
        System.out.println(Byte.parseByte(sByte));

    }
}
