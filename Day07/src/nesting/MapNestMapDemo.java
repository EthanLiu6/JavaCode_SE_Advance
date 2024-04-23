package nesting;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/23 09:26
 * @Project JavaCode_SE_Advance
 * @Theme Map嵌套Map
 */
public class MapNestMapDemo {
    public static void main(String[] args) {
        //班级1 ： 存储学号、姓名
        Map<String, String> classes1 = new HashMap<>();
        classes1.put("it001", "迪丽热巴");
        classes1.put("it002", "古力娜扎");
        classes1.put("it003", "马尔扎哈");
        classes1.put("it004", "欧阳娜娜");
        //班级2
        Map<String, String> classes2 = new HashMap<>();
        classes2.put("it001", "李小璐");
        classes2.put("it002", "白百何");
        classes2.put("it003", "马蓉");
        //班级3
        Map<String, String> classes3 = new HashMap<>();
        classes3.put("it001", "林丹");
        classes3.put("it002", "文章");
        classes3.put("it003", "陈赫");

        //Map集合中存储Map集合（把班级存储到年级下 ， 给每个班级定个名字）
        //注意创建的写法, 多练习几次
        Map<String, Map<String, String>> grade = new HashMap<>();
        grade.put("一班", classes1);
        grade.put("二班", classes2);
        grade.put("三班", classes3);

        //遍历嵌套集合
        //外层遍历(遍历班级)key ->> value遍历
        for (String classnName : grade.keySet()) {
            System.out.println(classnName + ":");
            //内层遍历(遍历班级学生)
            for (Map.Entry<String, String> stu : grade.get(classnName).entrySet()) {
                System.out.println(stu.getKey() + "---" + stu.getValue());
            }
            System.out.println("-----------------------------");
        }

    }
}
