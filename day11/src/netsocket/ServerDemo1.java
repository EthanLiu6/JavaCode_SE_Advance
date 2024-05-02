package netsocket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 12:40
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class ServerDemo1 {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端已启动");
        Socket server = serverSocket.accept();
        System.out.println("已连接客户端" + server.getInetAddress().getHostAddress() +":" + server.getInetAddress().getHostName());
        InputStream inputStream = server.getInputStream();

        byte[] buf = new byte[1024];
        int len = inputStream.read(buf);
        String msg = new String(buf, 0, len);
        System.out.println("收到信息:" + msg);
        inputStream.close();
        serverSocket.close();
    }
}
