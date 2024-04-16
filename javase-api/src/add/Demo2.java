package add;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/16 15:00
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Demo2 {
    public static void main(String[] args) {
        Collection<String> colStrs = new ArrayList<String>();
        colStrs.add("Ethan");
        colStrs.add("Qiu");
        colStrs.add("Java");
        colStrs.add("Love");

        for (String str : colStrs) {
            System.out.println(str);
        }
    }
}
