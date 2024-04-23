package nesting;

import java.util.*;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/23 08:59
 * @Project JavaCode_SE_Advance
 * @Theme List嵌套Map
 */
public class ListNestMapDemo {
    public static void main(String[] args) {
        //班级1
        Map<String, String> clases1 = new HashMap<>();
        clases1.put("it001", "迪丽热巴");
        clases1.put("it002", "古力娜扎");
        clases1.put("it003", "马尔扎哈");
        clases1.put("it004", "欧阳娜娜");
        //班级2
        Map<String, String> clases2 = new HashMap<>();
        clases2.put("it001", "李小璐");
        clases2.put("it002", "白百何");
        clases2.put("it003", "马蓉");
        //班级1
        Map<String, String> clases3 = new HashMap<>();
        clases3.put("it001", "林丹");
        clases3.put("it002", "文章");
        clases3.put("it003", "陈赫");

        //在List集合中存储Map集合
        List<Map<String, String>> grade = new ArrayList<>();
        grade.add(clases1);
        grade.add(clases2);
        grade.add(clases3);

        //遍历方式选择器
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入遍历方式(1或者2):");
        String caseSelect = scanner.nextLine();

        //遍历嵌套集合
        for (Map<String, String> classes : grade) {

            //Set<Map.Entry<String, String>> set = classes.entrySet();
            if (caseSelect.equals("2")) {
                //遍历班级(Map遍历方式2)
                for (Map.Entry<String, String> stringStringEntry : classes.entrySet()) {
                    System.out.println(stringStringEntry.getKey() + ": " + stringStringEntry.getValue());
                }

                System.out.println("---------------");
            }

            if (caseSelect.equals("1")) {
                //使用key找value遍历(遍历方式1)
                for (String s : classes.keySet()) {
                    System.out.println(s + "---" + classes.get(s));
                }
                System.out.println("----------------");
            }
        }
    }
}
