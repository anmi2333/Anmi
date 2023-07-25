package com.dreaMtank.udp;

import java.io.IOException;
import java.net.*;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class UDPReceiverB {
    public static void main(String[] args) throws IOException {
        //1
        DatagramSocket socket = new DatagramSocket(9998);
        //2
        byte[] data = "hello 明天吃火锅".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.1"), 9999);
        socket.send(packet);
        //3
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        //4
        int length = packet.getLength();
        data = packet.getData();
        String s = new String(data, 0 ,length);
        System.out.println(s);
        //5
        socket.close();
        System.out.println("B端退出");

    }
}
