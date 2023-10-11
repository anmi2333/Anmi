package com.dreaMtank.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket(9999);
        //1
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        System.out.println("接收端A 等待数据...");
        socket.receive(packet);
        //2
        int length = packet.getLength();
        byte[] data = packet.getData();
        String s = new String(data, 0 ,length);
        System.out.println(s);
        //3
        data = "好的明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.1.1"), 9998);
        socket.send(packet);
        //4
        socket.close();
        System.out.println("A端退出");
    }
}
