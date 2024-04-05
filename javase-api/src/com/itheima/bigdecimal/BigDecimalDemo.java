package com.itheima.bigdecimal;

import java.math.BigDecimal;

/*
    构造方法 :
        public BigDecimal(String val)	将 BigDecimal 的字符串表示形式转换为 BigDecimal
    成员方法 :
        public BigDecimal add(BigDecimal value)	加法运算
        public BigDecimal subtract(BigDecimal value)	减法运算
        public BigDecimal multiply(BigDecimal value)	乘法运算
        public BigDecimal divide(BigDecimal value)	除法运算(除不尽会有异常)
        public BigDecimal divide(BigDecimal value, int scale, RoundingMode roundingMode)	除法运算(除不尽，使用该方法)
        参数说明：
        scale 精确位数，
        roundingMode取舍模式
                   BigDecimal.ROUND_HALF_UP 四舍五入
                   BigDecimal.ROUND_FLOOR 去尾法
                   BigDecimal.ROUND_UP  进一法
 */
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimal num1 = new BigDecimal("100.2");
        BigDecimal num2 = new BigDecimal("2.2");
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2, 5, BigDecimal.ROUND_CEILING));

    }
}
