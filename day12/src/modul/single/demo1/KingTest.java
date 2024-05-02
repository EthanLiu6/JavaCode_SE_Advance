package modul.single.demo1;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 15:13
 * @Project JavaCode_SE_Advance
 * @Theme 单例设计模式
 */
public class KingTest {
    public static void main(String[] args) {
        King k1 = King.getInstance();
        King k2 = King.getInstance();
        King k3 = King.getInstance();
        King k4 = King.getInstance();
        King k5 = King.getInstance();

        System.out.println(k1.hashCode());
        System.out.println(k2.hashCode());
        System.out.println(k3.hashCode());

        System.out.println(k4);
        System.out.println(k5);
    }
}
