package lam;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 22:26
 * @Project JavaCode_SE_Advance
 * @Theme 案例
 */
public class ShowHandlerDemo {
    public static String str = "Ethan-";
    public static void main(String[] args) {
        //1.使用匿名内部类
        userShowHandler(new ShowHandler() {
            @Override
            public void show(String str) {
                System.out.println(str + "匿名内部类: 重写show方法");
            }
        });

        //2.使用Lambda表达式
        userShowHandler((String str) -> {
            System.out.println(str + "Lambda表达式: 重写show方法");
        });
    }

    /**
     * @param handler ShowHandler类型对象
     */
    private static void userShowHandler(ShowHandler handler) {
        //调用方法
        handler.show(str);
    }

}
