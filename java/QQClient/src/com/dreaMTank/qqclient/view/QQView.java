package com.dreaMTank.qqclient.view;

import com.dreaMTank.qqclient.utils.Utility;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class QQView {
    private boolean loop = true;//控制是否显示菜单
    private String key = "";//接收用户键盘输入

    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出系统...");
    }
    //显示主菜单
    private void mainMenu(){
        while (loop) {

            System.out.println("============欢迎登陆网络通讯系统============");
            System.out.println("\t\t 1 登陆系统");
            System.out.println("\t\t 9 退出系统");
            System.out.println("请输入你的选择: ");

            key = Utility.readString(1);

            switch (key) {
                case "1":
                    System.out.println("请输入用户号: ");
                    String userId = Utility.readString(50);
                    System.out.println("请输入密  码: ");
                    String pwd = Utility.readString(50);
                    if (true) {
                        System.out.println("============欢迎 " + userId + "============");
                        while (loop) {
                            System.out.println("\n===========网络通信系统二级菜单(用户 " + userId + " )===========");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 发送私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.println("请输入你的选择");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    System.out.println("\t\t 1 显示在线用户列表");
                                    break;
                                case "2":
                                    System.out.println("\t\t 2 群发消息");
                                    break;
                                case "3":
                                    System.out.println("\t\t 3 发送私聊消息");
                                    break;
                                case "4":
                                    System.out.println("\t\t 4 发送文件");
                                    break;
                                case "9":
                                    loop = false;
                            }
                        }
                    } else {
                        System.out.println("=============登陆失败============");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }
        }
    }
}
