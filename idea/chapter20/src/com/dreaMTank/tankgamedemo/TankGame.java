package com.dreaMTank.tankgamedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TankGame extends JFrame implements KeyListener {
    Tank tank;

    public static void main(String[] args) {
        new TankGame();
    }

    public TankGame() {
        tank = new Tank(100, 100); // 创建坦克对象

        this.setSize(800, 600); // 设置窗口大小
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置窗口关闭操作
        this.addKeyListener(this); // 添加键盘监听器
        this.setVisible(true); // 设置窗口可见
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // 绘制坦克
        g.setColor(Color.RED);
        g.fillRect(tank.getX(), tank.getY(), 30, 30);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        // 根据按键调整坦克的位置
        if (e.getKeyCode() == KeyEvent.VK_W) {
            tank.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            tank.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            tank.moveLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            tank.moveRight();
        }

        repaint(); // 重绘窗口
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

class Tank {
    private int x;
    private int y;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveUp() {
        y -= 10;
    }

    public void moveDown() {
        y += 10;
    }

    public void moveLeft() {
        x -= 10;
    }

    public void moveRight() {
        x += 10;
    }
}
