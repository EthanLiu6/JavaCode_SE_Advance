package com.ethan.anonymous.example;

import java.util.ArrayList;
import java.util.Scanner;

/*
需求 :
        1 创建用户(User)对象 , 对象数据采用键盘录入而来
        2 用户(User)包含的属性 :
            用户名   (username)
            手机号码 (phonNumber)
            登录密码 (password)
            确认密码 (confirm)
            电子邮箱 (email)
            性别     (sex)
            出生日期 (birthday)
        3 如果登录密码和确认密码不一致 , 重新输入
        4 把用户(User)对象 ,添加到ArrayList集合中 , 打印集合对象即可
*/
public class Register {
    public static void main(String[] args) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.print("输入用户名:");
        String username = sc.nextLine();
        System.out.print("输入手机号码:");
        String phonNumber = sc.nextLine();
        String password = "";
        String confirm = "";
        while (true) {
            System.out.print("输入登录密码:");
            password = sc.nextLine();
            System.out.print("输入确认密码:");
            confirm = sc.nextLine();
            if (password.equals(confirm)) {
                break;
            }
            System.out.println("输入密码与确认密码不一致,请重新输入");
        }
        System.out.print("输入电子邮箱:");
        String email = sc.nextLine();
        System.out.print("输入性别:");
        String sex = sc.nextLine();
        System.out.print("输入出生日期:");
        String birthday = sc.nextLine();

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User(username, phonNumber, password, confirm, email, sex, birthday));

        for (User user : userList) {
            System.out.println(user.getName());
            System.out.println(user.getPhoneNumber());
            System.out.println(user.getPassword());
            System.out.println(user.getConfirm());
            System.out.println(user.getEmail());
            System.out.println(user.getSex());
            System.out.println(user.getBirthday());
        }
    }
}
