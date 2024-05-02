package digui;

import java.io.File;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/29 23:52
 * @Project JavaCode_SE_Advance
 * @Theme 综合案例: 打印给定文件夹下的所有java或者Python文件
 */
public class Demo2 {
    public static void main(String[] args) {

        //定义文件输入流
        String strFile = "/users/ethan.liu/desktop/";
        File file = new File(strFile);

        long startTime = System.currentTimeMillis();
        String[] types = {"java", "py"};
        getSearchFile(file, types);
        long endTime = System.currentTimeMillis();
        System.out.println("总耗时: "+ (endTime-startTime) + "毫秒");
    }

    /***
     *
     * @param file 给定指定文件夹
     * @param types 指定查询文件类型
     *              (以.结尾的文件扩展名
     *              eg:"py")
     */
    private static void getSearchFile(File file, String[] types) {
        //给定文件夹不存在, 抛出异常
        if (!file.exists()) {
            throw new RuntimeException("输入文件路径不存在");
        }//存在,查找
        else {
            //获取文件元素列表
            File[] files = file.listFiles();
            //判断是文件还是文件夹
            for (File f : files) {
                if (f.isFile()) { //是文件, 查询
                    for (String type : types) {
                        if (f.getName().endsWith("." + type)) { //判断文件类型是否为指定文件类型
                            System.out.println(f.getAbsoluteFile()); //获取指定文件类型的绝对路径
                        }
                    }
                } else if (f.isDirectory()) { //是文件夹, 递归调用方法
                    getSearchFile(f, types);
                }
            }
        }
    }
}