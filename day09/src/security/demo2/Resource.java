package security.demo2;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/28 11:39
 * @Project JavaCode_SE_Advance
 * @Theme 生产者与消费者----资源
 */
//共享资源
public class Resource {
    public static int num = 0;
    public static final String LOCK = "对象锁";
}
