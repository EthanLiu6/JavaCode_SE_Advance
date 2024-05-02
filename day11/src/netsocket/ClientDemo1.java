package netsocket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @Author EthanLiu 16693226842@163.com
 * @Date 2024/5/2 12:31
 * @Project JavaCode_SE_Advance
 * @Theme xxx
 */
public class ClientDemo1 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outStream = socket.getOutputStream();
        outStream.write("好好学习".getBytes());
        outStream.close();
        socket.close();
    }
}
