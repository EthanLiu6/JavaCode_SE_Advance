package io.github.ethanliu6.genericity.demo03;

import java.util.ArrayList;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/20 17:21
 * @Project JavaCode_SE_Advance
 * @Theme 泛型限制
 */
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Student(126, "202234004026"));
        people.add(new Worker());
        show1(people);
        show2(people);

        System.out.println("\n+++++++++++++++++\n");
        ArrayList<Worker> workers = new ArrayList<>();
        workers.add(new Worker());
        // workers.add(new Student(123, "23453456")); 泛型限制
        show1(workers);
        // show2(workers); 编译出错,泛型下限受限
    }

    public static void show1(ArrayList<? extends Person> people) {
        System.out.println("show1是泛型上限");
    }

    public static void show2(ArrayList<? super Student> E){
        System.out.println("show2是泛型下限");
    }
}
