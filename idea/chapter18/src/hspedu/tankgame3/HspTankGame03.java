package hspedu.tankgame3;

import javax.swing.*;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class HspTankGame03 extends JFrame{
     //
    MyPanel mp = null;
    Hero hero = null; // 添加 Hero 对象的定义
    public static void main(String[] args) {
        HspTankGame03 hspTankGame01 = new HspTankGame03();
    }

    public HspTankGame03(){//构造器
        //初始化
        mp = new MyPanel();
        //面板放入窗口
        this.add(mp);
        //将mp放入到Thread 并启动
        Thread thread = new Thread(mp);
        thread.start();
        //设置窗口大小
        this.setSize(1000,750);
        //每次重新绘制新的坦克的方向
        this.addKeyListener(mp);
        //当点击窗口小x 程序去退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //可以显示
        this.setVisible(true);
    }
}
