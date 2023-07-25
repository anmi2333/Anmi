package com.dreaMTank.tankgame5;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class HspTankGame05 extends JFrame{
     //定义MyPanel
    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    Hero hero = null; // 添加 Hero 对象的定义
    public static void main(String[] args) {

        HspTankGame05 hspTankGame01 = new HspTankGame05();
    }

    public HspTankGame05(){//构造器
        //接收用户输入
        System.out.println("请输入选择 1: 新游戏 2: 继续上局");
        String key = scanner.next();
        //初始化
        mp = new MyPanel(key);
        //面板放入窗口
        this.add(mp);
        //将mp放入到Thread 并启动
        Thread thread = new Thread(mp);
        thread.start();
        //设置窗口大小
        this.setSize(1300,950);
        //每次重新绘制新的坦克的方向
        this.addKeyListener(mp);
        //当点击窗口小x 程序去退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可以显示
        this.setVisible(true);
        //在JFrame 中增加相应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });
    }
}
