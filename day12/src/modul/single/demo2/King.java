package modul.single.demo2;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 15:31
 * @Project JavaCode_SE_Advance
 * @Theme 懒汉式单例设计模式
 */
public class King {
    private static King king; //保证对象对象唯一性

    private King() { //构造方法私有化,保证外部不能够通过new关键字实例化对象
    }

    public static King getInstance() { //返回该类的实例, 保证外部可以访问实例对象
        if (king == null) { //懒汉式: 第一次使用时候才会创建, 后面使用会用第一创建的对象
            king = new King();
        }
        return king;
    }
}
