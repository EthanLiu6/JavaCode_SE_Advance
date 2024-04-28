package security.demo2;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 11:58
 * @Project JavaCode_SE_Advance
 * @Theme 生产者与消费者---测试
 */
public class Test {
    public static void main(String[] args) {
        new Thread(new ProductTask(), "生产者 ").start();
        new Thread(new CustomerTask(), "消费者 ").start();
    }
}
