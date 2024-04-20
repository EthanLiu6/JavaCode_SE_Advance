package io.github.ethanliu6.set;

import java.util.HashSet;
import java.util.Objects;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 20:26
 * @Project JavaCode_SE_Advance
 * @Theme HashSet
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Person> peopleSet = new HashSet<>();

        //向集合中添加Person对象
        peopleSet.add(new Person("Qiu Zhu", 21)); //匿名对象
        peopleSet.add(new Person("Ethan Liu", 21));
        peopleSet.add(new Person("Qiu Zhu", 21)); //输出发现并没有去重,需要重写hashCode并用equals方法


        //使用增强for来遍历(迭代器)
        for (Person person : peopleSet) {
            System.out.println(person);
        }
    }

}

class Person {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
}