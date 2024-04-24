package ex;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/4/25 00:20
 * @Project JavaCode_SE_Advance
 * @Theme 异常
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Logger logger = LoggerFactory.getLogger("异常处理");
        logger.trace("日期格式化对象为: yyyy-MM-dd");

        try {
            sdf.parse("2024/04/24");
        } catch (ParseException e) {
            logger.warn("注意解析日期格式要匹配");
            logger.info("该日期格式有误");

        }
        logger.trace("日期解析格式异常已处理");
    }
}
