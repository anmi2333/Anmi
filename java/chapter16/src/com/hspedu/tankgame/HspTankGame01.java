package com.hspedu.tankgame;

import com.hspedu.draw.DrawCircle;

import javax.swing.*;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class HspTankGame01 extends JFrame {
     //
    MyPanel mp = null;
    public static void main(String[] args) {
        HspTankGame01 hspTankGame01 = new HspTankGame01();
    }

    public HspTankGame01(){//构造器
        //初始化
        mp = new MyPanel();
        //面板放入窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(1000,750);
        //当点击窗口小x 程序去退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可以显示
        this.setVisible(true);
    }
}
