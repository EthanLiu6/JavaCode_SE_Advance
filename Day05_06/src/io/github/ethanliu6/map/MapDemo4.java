package io.github.ethanliu6.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 19:41
 * @Project JavaCode_SE_Advance
 * @Theme HashMap存储自定义对象（key）
 */
public class MapDemo4 {
    public static void main(String[] args) {
        //创建Map集合对象(存储自定义对象)
        Map<Student, String> studentMap = new HashMap<>();
        studentMap.put(new Student("Ethan", 21), "甘肃");
        studentMap.put(new Student("QiuZhu", 21), "广西");
        studentMap.put(new Student("Ethan", 21), "广西"); //去重后这里相当于修改

        //使用Map.Entry获取键值对对象
        Set<Map.Entry<Student, String>> entries = studentMap.entrySet();

        //遍历键值对对象
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry.getKey() + "\tPlace--" + entry.getValue());
        }

        //为了去重,我们还需要重写HashCode和equals方法
        // Student{name='Ethan', age=21}	Place--广西
        // Student{name='QiuZhu', age=21}	Place--广西

    }
}

class Student {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Student() {
    }
}