package demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 21:15
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class CopyFile {
    public static void main(String[] args) {

        String srcFile = "day10/src/resources/222.jpeg"; //源数据文件
        String destFile = "day10/src/demo/111.jpeg"; //目标文件

        //计时
        long startTime = System.currentTimeMillis();
        copy(srcFile, destFile);
        long endTile = System.currentTimeMillis();
        System.out.println("复制花费了" + (endTile - startTime) + "毫秒");
    }

    /**
     *
     * @param srcFile 源数据文件地址
     * @param destFile 目标文件地址
     */
    private static void copy(String srcFile, String destFile) {

        //创建输入输出流
        //循环读取
        //循环写入
        try( FileInputStream fis = new FileInputStream(srcFile);
             FileOutputStream fos = new FileOutputStream(destFile)){ //升级: 省略手动释放资源

            int data = -1;
            //未读完
            while ((data = fis.read()) != -1){
                fos.write(data); //读一个字节数据写一个字节数据
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
