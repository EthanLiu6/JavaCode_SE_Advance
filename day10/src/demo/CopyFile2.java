package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 21:50
 * @Project JavaCode_SE_Advance
 * @Theme 多字节数据读写
 */
public class CopyFile2 {
    public static void main(String[] args) {

        String srcFile = "day10/src/resources/222.jpeg"; //源数据文件
        String destFile = "day10/src/demo/demo2.txt"; //目标文件

        //计时
        long startTime = System.currentTimeMillis();
        copy(srcFile, destFile);
        long endTile = System.currentTimeMillis();
        System.out.println("复制花费了" + (endTile - startTime) + "毫秒");
    }

    private static void copy(String srcFile, String destFile) {
        try(FileInputStream fis = new FileInputStream(srcFile); //输入字节流
            FileOutputStream fos = new FileOutputStream(destFile)){ //输出字节流

            //字节数组
            byte[] buf = new byte[1024]; //一次读取1k
            int len = -1;
            while ((len = fis.read(buf)) != -1){
                fos.write(buf, 0, len);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
