package io.github.ethanliu6.set;

import java.util.TreeSet;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 00:07
 * @Project JavaCode_SE_Advance
 * @Theme TreeSet集合
 */
public class TreeSetDemo3 {
    //使用TreeSet集合存储自定义对象
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student2> set = new TreeSet<>();

        //添加元素
        set.add(new Student2("Ethan", 21));
        set.add(new Student2("Qiu", 21));
        set.add(new Student2("Liu", 21));
        set.add(new Student2("Qiu", 20));
        set.add(new Student2("Qiu", 20)); //这种匿名对象在这也会去重
        set.add(new Student2("Qiu", 18));
        set.add(new Student2("qiu", 22));

        for (Student2 student : set) {
            System.out.println(student);
        }
    }
}

class Student2 implements Comparable<Student2> {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student2() {
    }

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

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student2 student) {
        //先按照age排序,age相同再按照name排序

        //this: 当前对象
        //stu: 传递过来的对象

        //String类本身实现Comparable接口, 并重写了compareTo方法
        //即: String类自带自然排序
        int res = this.age - student.age;
        if (res == 0) {
            res = this.name.compareTo(student.name);
        }
        return res;
    }
}
