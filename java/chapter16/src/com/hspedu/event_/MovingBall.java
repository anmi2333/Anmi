package com.hspedu.event_;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * @ author WANG CHAO
 * @ version 1.0
 */

public class MovingBall extends JPanel implements KeyListener {
    private int x = 250; // 小球的初始 x 坐标
    private int y = 250; // 小球的初始 y 坐标

    public MovingBall() {
        setFocusable(true);
        addKeyListener(this);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 50, 50); // 绘制小球
    }

    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) { // 上箭头键
            y -= 10;
        } else if (keyCode == KeyEvent.VK_DOWN) { // 下箭头键
            y += 10;
        } else if (keyCode == KeyEvent.VK_LEFT) { // 左箭头键
            x -= 10;
        } else if (keyCode == KeyEvent.VK_RIGHT) { // 右箭头键
            x += 10;
        }
        repaint(); // 重绘小球
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Moving Ball");
        MovingBall ball = new MovingBall();
        frame.add(ball);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
