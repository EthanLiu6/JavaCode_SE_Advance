package thread;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/27 11:12
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class Demo1 extends Thread { /* 需要继承Thread */
  @Override
  public void run() { /* 需要重写多线程的run()方法 */
    //run()方法线程体
    for (int i = 0; i < 800; i++) {
      System.out.println("run:" + i);
    }
  }
  public static void main(String[] args) {
    //main线程，主线程
    //创建一个线程对象
    Demo1 testThread1 = new Demo1();
    //调用start()方法开启线程（不能调用run()方法哦）
    testThread1.start();

    for (int i = 0; i < 1000; i++) {
      System.out.println("main:" + i);
    }
  }
}