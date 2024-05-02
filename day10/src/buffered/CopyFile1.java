package buffered;

import java.io.*;
import java.nio.file.FileVisitOption;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/29 19:54
 * @Project JavaCode_SE_Advance
 * @Theme 使用字节缓冲流进行文件复制
 */
public class CopyFile1 {
    public static void main(String[] args) {
        String srcFile = "day10/src/buffered/TwoAnimations.mp4"; //原文件
        String destFile = "day10/src/buffered/CopyTwoAnimations.mp4"; //目标文件

        //计时
        long startTime = System.currentTimeMillis();
        //文件复制
        try {
            copy(srcFile, destFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //耗时
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时" + (endTime - startTime) + "毫秒");



    }

    /**
     *
     * @param srcFile Sting类型的源文件
     * @param destFile Sting类型的目标文件
     */
    private static void copy(String srcFile, String destFile){
        //读数据
        //创建字节输入流
        // 写数据
        //创建字节输出流


        //使用升级后的jdk功能
        try {
            //使用字节缓冲流
            BufferedInputStream bfis = new BufferedInputStream( new FileInputStream(srcFile));
            BufferedOutputStream bfos  = new BufferedOutputStream( new FileOutputStream(destFile, true));  //追加写入
            //2.循环读取
            byte[] datas = new byte[1024]; //一次读取数据大小 1k
            int len = -1; //初始化读取数据
            // 判断是否读完,没完,写入
            while ((len = bfis.read(datas)) != -1) { //为了方便写入数据所以初始化了data
                bfos.write(datas, 0, len);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
