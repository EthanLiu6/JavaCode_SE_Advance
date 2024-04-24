package ex;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 01:23
 * @Project JavaCode_SE_Advance
 * @Theme throw
 */
public class ExceptionDemo3 {
    public static void main(String[] args) {
        String name = null;
        getName(name);
    }

    private static void getName(String name) {
        if (name == null || "".equals(name)){
            throw new RuntimeException("name不能为空", new NullPointerException("空指针异常"));
            //System.out.println("dadada"); 不可再写
        }
        System.out.println("dadada");
    }
}
