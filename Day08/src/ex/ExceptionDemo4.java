package ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 16:42
 * @Project JavaCode_SE_Advance
 * @Theme 异常捕获
 */
public class ExceptionDemo4 {
    private static final Logger LOGGER = LoggerFactory.getLogger("ExceptionDemo4类");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("输入你的生日(年-月-日):");
            String birthday = sc.nextLine();
            try {
                mothed(birthday); //需要捕获(调用的方法可能发生异常,需要自己处理)
                System.out.println("生日: " + birthday);
            } catch (ParseException e) {
                System.out.println("开始捕获异常");
                LOGGER.error(e.getMessage());
            }
        }
    }

    private static Date mothed(String date) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(date); //需要声明异常
    }
}
