package com.itheima.polymorphic.demo6;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/4 14:37
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Test {
    public static void main(String[] args) {
        //匿名对象访问
        player(new MP3());
        System.out.println("_______________");

        //子类对象访问
        MP4 mp4 = new MP4();
        player(mp4);
        System.out.println("_______________");

        //父类引用, 子类对象
        Player phone = new Phone();
        player(phone);
        System.out.println("_______________");

    }

    private static void player(Player player) {
        player.play();
        player.pause();
        player.stop();
    }
}
