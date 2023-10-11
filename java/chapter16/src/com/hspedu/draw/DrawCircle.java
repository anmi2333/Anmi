package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

/**
 * @ author WANG CHAO
 * @ version 1.0
 * 演示如何在面板上画出圆形
 */
@SuppressWarnings({"all"})
public class DrawCircle extends JFrame{//窗口
    //定义一个面板
    private MyPanel mp = null;

    public static void main(String[] args) {

        new DrawCircle();
        System.out.println("退出程序");

    }
    public  DrawCircle() {//构造器
        //初始化
        mp = new MyPanel();
        //面板放入窗口
        this.add(mp);
        //设置窗口大小
        this.setSize(400,300);
        //当点击窗口小x 程序去退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可以显示
        this.setVisible(true);
    }
}

//定义一个面板MyPanel() 继承JPanel类
class MyPanel extends JPanel {
    @Override
    public void paint(Graphics g) {//绘图方法
        System.out.println("paint 方法被调用");
        super.paint(g);
        //演示绘制不同的图形
        //画直线
        //g.drawRect(10,10,100,100);
        //画矩形边框
        // g.drawRect(10,10,100,100);
        //画椭圆边框
        //g.drawRect(10,10,100,100);
        //设置画笔颜色 字体
//        g.setColor(Color.cyan);
//        g.setFont(new Font("隶书",Font.BOLD,50));
        //填充矩形
        //g.fillRect(10,10,100,100);
        //填充椭圆
        //g.fillOval(10,10,100,100);
        //画图片 1.获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bp.jpeg"));
//        g.drawImage(image,10,10,200,200,this);
        //画字符串
        //g.drawString("轻井泽",100,100);
        //设置画笔的字体
        //g.setFont(new Font("隶书",Font.BOLD,50));
        //设置画笔的颜色
//        g.setColor(Color.cyan);
//        //绘制坦克
//        g.fillRect(50,50,10,50);
//        g.fillRect(80,50,10,50);
//        g.fillOval(55,60,30,30);
//        g.fillRect(70,50,2,25);
    }
}


