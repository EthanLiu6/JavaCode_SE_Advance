package thread;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/27 11:37
 * @Project JavaCode_SE_Advance
 * @Theme Runnable接口线程
 */
public class MyTask implements Runnable {
    @Override
    //线程任务
    public void run() {
        //run()方法线程体
        for (int i = 0; i < 800; i++) {
            System.out.println("run:" + i);
        }
    }
}
