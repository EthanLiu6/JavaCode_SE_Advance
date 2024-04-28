package security.demo2;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 11:41
 * @Project JavaCode_SE_Advance
 * @Theme 生产者
 */
public class ProductTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            //加入锁对象, 同步代码块
            synchronized (Resource.LOCK) {
                //没吃的: 生产
                if (Resource.num == 0) {
                    System.out.println(Thread.currentThread().getName() + "没有生产,开始生产......");
                    //生产
                    Resource.num = 1;
                    System.out.println(Thread.currentThread().getName() + "生产了" + Resource.num + "个");
                    //唤醒
                    Resource.LOCK.notify();
                //有吃的: 等待
                } else {
                    System.out.println(Thread.currentThread().getName() + "已生产食物,等待顾客食用......");
                    try {
                        Resource.LOCK.wait();//无限等待, 会释放掉对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
