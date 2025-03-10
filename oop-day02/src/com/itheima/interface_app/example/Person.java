package com.itheima.interface_app.example;

public abstract class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void study();

    public void show() {
        System.out.println("name:" + this.getName());
        System.out.println("age:" + this.getAge());
    }
}
