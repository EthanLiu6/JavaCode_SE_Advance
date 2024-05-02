package modul.single.demo1;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 15:14
 * @Project JavaCode_SE_Advance
 * @Theme 单例设计模式
 */

/**
 * 1. 构造方法私有化: 保证外部不能够通过new关键字实例化该类
 * 2. 设置公开静态方法, 并在该方法返回该类的实现:  保证外部可以访问该实例化类
 * 3. 为保证唯一性(共用同一个实例), 将该类的实现作为私有成员变量
 */
public class King {
    private static King king = new King(); //3.

    private King() { // 1.
    }

    public static King getInstance(){
        // return new King(); // 2.
        return king; // 3.
    }
}
