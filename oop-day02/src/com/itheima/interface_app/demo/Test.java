package com.itheima.interface_app.demo;

/**
 * @BelongsProject: javase-oop
 * @BelongsPackage: com.itheima.interface_app.demo
 * @Auther: Double 17839227351@163.com
 * @Date: 2022/10/29 15 20
 * @Since JDK 17.0
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        MP3 mp3 = new MP3();
        MP4 mp4 = new MP4();
        Phone p = new Phone();
        show(mp3);
        System.out.println();
        show(mp4);
        System.out.println();
        show(p);
    }

    public static void show(Player player) {
        player.play();
        player.pause();
        player.stop();
    }
}
