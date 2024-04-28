package file;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 15:48
 * @Project JavaCode_SE_Advance
 * @Theme 统计文件个数
 */
public class Demo2 {
    public static void main(String[] args) {
        String path = "day10/src/resources/";
        mothed(path);
    }

    private static void mothed(String path) {
        // 利用HashMap统计个数
        Map<String, Integer> fileMap = new HashMap<>();
        File file = new File(path);
        // 判断文件夹存在
        if (file.exists()) {

            // 1.创建file对应数组
            File[] files = file.listFiles();

            // 2.遍历文件数组并对文件格式进行提取
            for (File f : files) {
                String name = f.getName();//获取文件名
                String s = name.split("\\.")[1]; //获取文件类型名, 对于多个.的文件名不能使用
                //String s = name.lastIndexOf(".")// 获取.所在的索引

                // 3.统计个数
                if (fileMap.get(s) == null){
                    fileMap.put(s, 1);
                }else{
                    int n = fileMap.get(s);
                    n++;
                    fileMap.put(s, n);

                }
            }
        } else {
            throw new RuntimeException("输入文件路径不存在");
        }
        System.out.println(fileMap);
    }
}
