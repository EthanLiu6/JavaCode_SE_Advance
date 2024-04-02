package com.ethan.override;

//新手机：基本的打电话下支持视频通话，基本的发信息下支持发送语音和图片
public class NewPhone extends Phone {
    public NewPhone() {
    }

    @Override
    public void call() {
        System.out.println("开启摄像头");
        super.call();
    }

    @Override
    public void sendMessage() {
        System.out.println("发了张图片");
        System.out.println("发了条语音");
        super.sendMessage();
    }
}
