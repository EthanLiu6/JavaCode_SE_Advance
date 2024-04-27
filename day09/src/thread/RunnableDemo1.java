package thread;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/27 11:39
 * @Project JavaCode_SE_Advance
 * @Theme Runnable线程测试
 */
public class RunnableDemo1 {
    public static void main(String[] args) {
        //创建`Thread`类对象， 并把实现了`Runnable`接口的子类对象，作为参数传递给`Thread`类对象
        Thread thread = new Thread(new MyTask());
        //启动线程
        thread.start();

        //main函数线程体
        for (int i = 0; i < 1000; i++) {
            System.out.println("main:" + i);
        }
    }
}
