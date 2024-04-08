package com.itheima.string;


public class StringDemo2 {
    /*
    已知字符串，完成右侧需求
    String str = "I Love Java, I Love Heima";
    需求：
    0.计算a出现的次数
    1.将所有 Love 替换为 Like ,打印替换后的新字符串
    2.截取字符串 "I Love Heima"
    3.截取字符串 "Java"
    */
    public static void main(String[] args) {
        String str = "I Love Java, I Love Heima";
        char[] strArr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' == strArr[i]){
                counter++;
            }
        }
        System.out.println(counter);

        String res = str.replace("Love", "Like");
        System.out.println(res);

        System.out.println(str.substring(13));

        System.out.println(str.substring(7, 11));




    }
}
