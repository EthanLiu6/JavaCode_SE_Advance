package io.github.ethanliu6.set;

import java.util.TreeSet;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 00:07
 * @Project JavaCode_SE_Advance
 * @Theme TreeSet集合
 */
public class TreeSetDemo2 {
    //使用TreeSet集合存储自定义对象
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student> set = new TreeSet<>();

        //添加元素
        set.add(new Student("Ethan", 21));
        set.add(new Student("Qiu", 21));
        set.add(new Student("Liu", 21));
        set.add(new Student("Qiu", 20));
        set.add(new Student("Qiu", 20)); //这种匿名对象在这也会去重
        set.add(new Student("Qiu", 18));
        set.add(new Student("qiu", 22));

        for (Student student : set) {
            System.out.println(student);
        }
    }
}

class Student implements Comparable<Student>{
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Student {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student() {
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student stu) {
        //先按照姓名排序,姓名相同再按照年龄排序

        //this: 当前对象
        //stu: 传递过来的对象

        //String类本身实现Comparable接口, 并重写了compareTo方法
        //即: String类自带自然排序
        int result = this.name.compareTo(stu.name);
        if (result==0){
            result = this.age - stu.age;
        }
        return result;
    }
}