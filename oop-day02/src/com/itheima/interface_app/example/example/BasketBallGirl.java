package com.itheima.interface_app.example.example;

public class BasketBallGirl extends Girl implements PlayBasketBall{
    @Override
    public void play() {
        System.out.println("女孩打篮球");
    }
}
