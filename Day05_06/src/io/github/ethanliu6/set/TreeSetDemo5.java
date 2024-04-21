package io.github.ethanliu6.set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/21 15:44
 * @Project JavaCode_SE_Advance
 * @Theme Comparator接口: 匿名内部类自定义排序
 */
public class TreeSetDemo5 {

    //按照年龄从小到大排序, 年龄相同,按照名字顺序从小到大排序
    public static void main(String[] args) {
        //无需再构建子类继承和重写,直接使用匿名内部类重写
        TreeSet<Teacher> teacherTreeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher teacher1, Teacher teacher2) {
                int res = teacher1.getAge() - teacher2.getAge();
                if (res == 0) {
                    res = teacher1.getName().compareTo(teacher2.getName());
                }
                return res;
            }
        });

        teacherTreeSet.add(new Teacher("ethan", 21));
        teacherTreeSet.add(new Teacher("ethan", 25));
        teacherTreeSet.add(new Teacher("qiu", 21));
        teacherTreeSet.add(new Teacher("qiu", 22));
        teacherTreeSet.add(new Teacher("ethan", 25));

        for (Teacher teacher : teacherTreeSet) {
            System.out.println(teacher);
        }
    }
}

class Teacher {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Teacher{" +
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

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Teacher() {
    }
}
