package security.demo2;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 11:42
 * @Project JavaCode_SE_Advance
 * @Theme 消费者
 */
public class CustomerTask implements Runnable {
    @Override
    public void run() {
        while (true) {
            //同步代码块
            synchronized (Resource.LOCK) {
                //没吃的: 等待
                if (Resource.num == 0) {
                    //等待
                    try {
                        System.out.println(Thread.currentThread().getName() + "没有发现食物, 等待中......");
                        Resource.LOCK.wait(); //无限等待,会释放掉对象锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //有吃的: 消费
                } else {
                    System.out.println(Thread.currentThread().getName() + "发现食物, 开始消费了");
                    Resource.num--;
                    System.out.println(Thread.currentThread().getName() + "消费完了");
                    //唤醒: 生产者可以继续生产食物了
                    Resource.LOCK.notify();
                }
            }
        }
    }
}
