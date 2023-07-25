package com.dreaMtank.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Api {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);
    }
}
