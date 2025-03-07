package com.itheima.biginteger;

import java.math.BigInteger;

/*
    构造方法 :
        BigInteger(String value)	可以将整数的字符串，转换为BigInteger对象
    成员方法 :
        public BigInteger add (BigInteger value)	    超大整数加法运算
        public BigInteger subtract (BigInteger value)	超大整数减法运算
        public BigInteger multiply (BigInteger value)	超大整数乘法运算
        public BigInteger divide (BigInteger value)	超大整数除法运算，除不尽取整数部分

 */
public class BigIntegerDemo {
    public static void main(String[] args) {
        BigInteger num1 = new BigInteger("1234567898765432");
        BigInteger num2 = new BigInteger("123");
        System.out.println(num1.add(num2));
        System.out.println(num1.subtract(num2));
        System.out.println(num1.multiply(num2));
        System.out.println(num1.divide(num2));

    }
}
