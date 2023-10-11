package com.hspedu.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * @ author WANG CHAO
 * @ version 1.0
 * 坦克大战绘图区
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    Hero hero = null;
    public MyPanel() {
        hero = new Hero(100, 100);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);

        //画坦克 封装方法
        drawTank(hero.getX(),hero.getY(),g,0,0);
    }

    public void drawTank (int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://我方坦克
                g.setColor(Color.cyan);
                break;
            case 1://敌人坦克
                g.setColor(Color.YELLOW);
                break;
        }
        //坦克方向绘制坦克
        switch (direct) {
            case 0://向上
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x + 30,y,10,60,false);
                g.fill3DRect(x + 10,y + 10,20,40,false);
                g.fillOval(x + 10,y + 20,20,20);
                g.drawLine(x + 20,y + 30,x+20,y);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
}
