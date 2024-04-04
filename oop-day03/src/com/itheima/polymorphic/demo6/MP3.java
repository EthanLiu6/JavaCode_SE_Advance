package com.itheima.polymorphic.demo6;

public class MP3 implements Player {
    @Override
    public void play() {
        System.out.println("MP3播放音乐");
    }

    @Override
    public void pause() {
        System.out.println("MP3暂停播放音乐");
    }

    @Override
    public void stop() {
        System.out.println("MP3停止播放音乐");
    }
}
