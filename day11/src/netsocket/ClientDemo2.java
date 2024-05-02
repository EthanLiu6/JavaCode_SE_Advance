package netsocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 12:31
 * @Project JavaCode_SE_Advance
 * @Theme 客户端
 */
public class ClientDemo2 {
    //创建日志成员变量
    private static final Logger LOGGER = LoggerFactory.getLogger("客户端");

    public static void main(String[] args) throws IOException {
        //创建客户端对象
        Socket client = new Socket("127.0.0.1", 8888);

        //给服务端发送数据

        //创建输出流并写入数据
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("你好啊,我的客户端".getBytes());

        //接收服务端信息

        //创建输入流并读取
        InputStream inputStream = client.getInputStream();
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        String msg = new String(buf, 0, len);
        LOGGER.trace("收到客户端数据:" + msg);

        //关闭资源
        inputStream.close();
        outputStream.close();
        client.close();

    }
}
