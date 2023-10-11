package com.dreaMTank.qqclient.service;

import com.dreaMTank.qqcommon.Message;
import com.dreaMTank.qqcommon.MessageType;
import com.dreaMTank.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class UserClientService {
    private User u = new User();
    private Socket socket;

    public UserClientService() {
    }

    public boolean checkUser(String userId, String pwd) {
        boolean b = false;
        u.setUserId(userId);
        u.setUserId(pwd);
        //连接到服务端 发送u对象
        try {
            socket = new Socket(InetAddress.getByName("192.168.1.1"), 9999);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);
            //读取从服务器回复到对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)){
                b = true;
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                clientConnectServerThread.start();
            } else {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }
}
