import java.awt.*;
import java.awt.event.*;

public class TankWar extends Frame implements KeyListener {
    int x = 50, y = 50; // 坦克的初始位置
    boolean bL = false, bU = false, bR = false, bD = false; // 记录键盘按键状态

    public static void main(String[] args) {
        new TankWar();
    }

    public TankWar() {
        setSize(800, 600);
        setResizable(false);
        setTitle("TankWar");
        setVisible(true);

        addKeyListener(this);

        // 实现窗口关闭功能
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    // 重写paint方法，绘制坦克
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.RED);
        g.fillRect(x, y, 30, 30); // 绘制红色的坦克
        g.setColor(c);

        // 移动坦克的位置
        if (bL) x -= 5;
        if (bU) y -= 5;
        if (bR) x += 5;
        if (bD) y += 5;
    }

    // 重写keyPressed方法，处理按键按下的事件
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        // 根据按键的代码来判断按下了哪个键，并设置对应的状态
        switch(key) {
            case KeyEvent.VK_LEFT:
                bL = true;
                break;
            case KeyEvent.VK_UP:
                bU = true;
                break;
            case KeyEvent.VK_RIGHT:
                bR = true;
                break;
            case KeyEvent.VK_DOWN:
                bD = true;
                break;
        }
    }

    // 重写keyReleased方法，处理按键松开的事件
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();

        // 根据按键的代码来判断松开了哪个键，并设置对应的状态
        switch(key) {
            case KeyEvent.VK_LEFT:
                bL = false;
                break;
            case KeyEvent.VK_UP:
                bU = false;
                break;
            case KeyEvent.VK_RIGHT:
                bR = false;
                break;
            case KeyEvent.VK_DOWN:
                bD = false;
                break;
        }
    }

    // 重写keyTyped方法，处理按键类型事件
    public void keyTyped(KeyEvent e) {}
}
