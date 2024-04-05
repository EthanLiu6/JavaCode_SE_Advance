package com.itheima.object.tostring;

public class Test {
    //演示：toString方法
    public static void main(String[] args) {

        // 以前的方法
        Student stu1 = new Student("ethan", 21);
        System.out.println(stu1.getName());
        System.out.println(stu1.getAge());
        System.out.println(stu1.toString()); // com.itheima.object.tostring.Student@7a81197d

        // 使重写的toString方法(IDE自带快捷键生成)
        System.out.println(stu1.toString()); // Student{name='ethan', age=21}

        // println()自己有继承toString()
        System.out.println(stu1); // Student{name='ethan', age=21}
        // return (obj == null) ? "null" : obj.toString();
    }
}
