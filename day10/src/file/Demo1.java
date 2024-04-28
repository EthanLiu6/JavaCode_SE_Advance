package file;

import java.io.File;
import java.io.IOException;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 13:03
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建File对象并创建文件夹
        new File("./day10/src/test/").mkdir(); //需要mkdir()方法
        //指定文件夹下创建文件
        File file = new File("./day10/src/test/", "test.md");
        file.createNewFile(); //需要createNewFile()方法
        System.out.println(file);

    }
}
