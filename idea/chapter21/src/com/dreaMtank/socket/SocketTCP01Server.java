package com.dreaMtank.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class SocketTCP01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.printf("服务端,在9999端口监听，等待链接");
        Socket socket = serverSocket.accept();
        System.out.printf("服务端 socket= " + socket.getClass());
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readLen = 0;
        while ((readLen = inputStream.read(buf)) != -1) {
            System.out.println(new String(buf,0,readLen));
        }
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
