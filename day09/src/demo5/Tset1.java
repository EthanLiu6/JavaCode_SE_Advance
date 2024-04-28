package demo5;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/27 23:44
 * @Project JavaCode_SE_Advance
 * @Theme 线程通讯
 */
public class Tset1 {
    public static void main(String[] args) {
        new Thread(()->
        {
            synchronized ("对象锁"){
                try {
                    "对象锁".wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }
}
