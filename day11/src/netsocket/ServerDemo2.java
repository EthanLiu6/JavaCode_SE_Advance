package netsocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 12:40
 * @Project JavaCode_SE_Advance
 * @Theme 服务端
 */
public class ServerDemo2 {
    private static final Logger LOGGER = LoggerFactory.getLogger("服务端");
    public static void main(String[] args) throws IOException {
        //创建服务端对象
        ServerSocket serverSocket = new ServerSocket(8888);
        LOGGER.trace("服务端已启动.......");
        //监听客户端
        Socket sever = serverSocket.accept();
        LOGGER.trace("已连接客户端:" + sever.getInetAddress().getHostAddress());

        //创建输入流对象
        InputStream inputStream = sever.getInputStream();

        //接受客户端发送的数据(IO流)
        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);

        //收到数据
        String msg = new String(buf, 0, len);
        System.out.println(msg);

        //回馈数据

        //创建输出流并添加数据
        OutputStream outputStream = sever.getOutputStream();
        outputStream.write("你好你好".getBytes());

        //资源关闭
        inputStream.close();
        outputStream.close();
        serverSocket.close(); //服务端一般是不用关闭的
    }
}
