package com.dreaMTank.tankgame5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

/**
 * @ author WANG CHAO
 * @ version 1.0
 * 坦克大战绘图区
 */
@SuppressWarnings("all")
public class MyPanel extends JPanel implements KeyListener,Runnable{
    //定义我的坦克
    Hero hero = null;
    Vector<EnemyTank> enemyTanks = new Vector<>();
    Vector<Node> nodes = new Vector<>();
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 9;
    //定义三张图片
    Image image1 = null;

    Image image2 = null;
    Image image3 = null;
    public MyPanel(String key) {
//        File file = new File(Recorder.getRecordFile());
//        if (file.exists()) {
//            nodes = Recorder.getNodesAndEnemyTankRec();
//        } else {
//            System.out.println("文件不存在只能开启新游戏");
//            key = "1";
//        }
        Recorder.setEnemyTanks(enemyTanks);
        hero = new Hero(900, 650);
        hero.setSpeed(20);

        switch (key) {
            case "1":
                //初始化敌人的坦克
                for (int i = 0; i < enemyTankSize; i++) {
                    //创建一个敌人坦克
                    EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
                    //将enemyTanks 设置给 enemyTank对象
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(2);
                    enemyTank.setSpeed(1);
                    //q启动坦克 让它动起来
                    new Thread(enemyTank).start();
                    //给该坦克加入子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60,enemyTank.getDirect());
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            case "2"://继续上局游戏
                //初始化敌人的坦克
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    //创建一个敌人坦克
                    EnemyTank enemyTank = new EnemyTank(node.getX(),node.getY());
                    //将enemyTanks 设置给 enemyTank对象
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(node.getDirect());
                    enemyTank.setSpeed(3);
                    //q启动坦克 让它动起来
                    new Thread(enemyTank).start();
                    //给该坦克加入子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60,enemyTank.getDirect());
                    enemyTank.shots.add(shot);
                    new Thread(shot).start();
                    //加入
                    enemyTanks.add(enemyTank);
                }
                break;
            default:
            System.out.println("你的输入有误");
        }

        image1 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(MyPanel.class.getResource("/bomb_3.png"));

        //播放音乐
        //new PlayAudio("111.wav").start();
    }
    //编写方法 显示我方击毁敌方坦克信息
    public void showInfo(Graphics g) {
        g.setColor(Color.green);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);
        g.drawString("您累计击毁敌方坦克",1020 ,30);
        drawTank(1020, 60, g,0, 0);
        g.setColor(Color.BLACK);
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);
        showInfo(g);
        if (hero != null && hero.isLive) {
            drawTank(hero.getX(),hero.getY(),g,hero.getDirect(),1);
        }
        //画坦克 封装方法
//        drawTank(enemyTank.getX() + 50, enemyTank.getY(), g, 2,0);
//        drawTank(enemyTank.getX() + 200, enemyTank.getY(), g, 2,0);
//        drawTank(enemyTank.getX() + 350, enemyTank.getY(), g, 2,0);
        //画出自己的子弹
        if(hero.shot != null && hero.shot.isLive == true) {
            //System.out.println("子弹被绘制");
            g.setColor(Color.YELLOW);
            //g.fill3DRect(hero.shot.x,hero.shot.y,50,50,false);
            g.fill3DRect(hero.shot.x,hero.shot.y,4,4,false);
        }

//        for (int i = 0; i < hero.shots.size(); i++) {
//            Shot shot = hero.shots.get(i);
//            if(hero.shot != null && hero.shot.isLive == true) {
//                g.setColor(Color.YELLOW);
//                g.fill3DRect(shot.x, shot.y, 2, 2, false);
//            } else  {
//                hero.shots.remove(shot);
//            }
//        }

        for (int i = 0; i < bombs.size(); i++) {
            Bomb bomb = bombs.get(i);
            if (bomb.life > 3) {
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            } else if(bomb.life > 1) {
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            bomb.lifeDown();
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        for(int i = 0; i < enemyTanks.size(); i++){
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断
            if (enemyTank.isLive) {
            drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (shot.isLive){
                    g.draw3DRect(shot.x,shot.y,2,2,false);
                } else {
                    enemyTank.shots.remove(shot);
                }
            }
            }
        }
    }


    public void drawTank (int x, int y, Graphics g, int direct, int type) {
        switch (type) {
            case 0://敌方坦克
                g.setColor(Color.cyan);
                break;
            case 1://我方坦克
                g.setColor(Color.YELLOW);
                break;
        }
        //坦克方向绘制坦克 0上 1右 2下 3左
        switch (direct) {
            case 0://向上
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x + 30,y,10,60,false);
                g.fill3DRect(x + 10,y + 10,20,40,false);
                g.fillOval(x + 10,y + 20,20,20);
                g.drawLine(x + 20,y + 30,x+20,y);
                break;
            case 1://向右
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y + 30,60,10,false);
                g.fill3DRect(x + 10,y + 10,40,20,false);
                g.fillOval(x + 20,y + 10,20,20);
                g.drawLine(x + 30,y + 20,x+60,y + 20);
                break;
            case 2://向下
                g.fill3DRect(x,y,10,60,false);
                g.fill3DRect(x + 30,y,10,60,false);
                g.fill3DRect(x + 10,y + 10,20,40,false);
                g.fillOval(x + 10,y + 20,20,20);
                g.drawLine(x + 20,y + 30,x + 20,y + 60);
                break;
            case 3://向右
                g.fill3DRect(x,y,60,10,false);
                g.fill3DRect(x,y + 30,60,10,false);
                g.fill3DRect(x + 10,y + 10,40,20,false);
                g.fillOval(x + 20,y + 10,20,20);
                g.drawLine(x + 30,y + 20,x,y + 20);
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    public void hitEnemyTank() {
        if (hero.shot != null && hero.shot.isLive) {
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot, enemyTank);
            }
        }
    }

    public void hitHero() {
        for (int i = 0; i < enemyTanks.size(); i++) {
            EnemyTank enemyTank = enemyTanks.get(i);
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                Shot shot = enemyTank.shots.get(j);
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }
    public  void hitTank(Shot s, Tank enemyTank) {
            switch (enemyTank.getDirect()) {
                case 0:
                    if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                            && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                        s.isLive = false;
                        enemyTank.isLive = false;
                        enemyTanks.remove(enemyTank);
                        if (enemyTank instanceof EnemyTank) {
                            Recorder.addALLEnemyTankNum();
                        }
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);
                    }
                    break;
                case 2:
                    if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                            && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                        s.isLive = false;
                        enemyTank.isLive = false;
                        enemyTanks.remove(enemyTank);
                        if (enemyTank instanceof EnemyTank) {
                            Recorder.addALLEnemyTankNum();
                        }
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);
                    }
                    break;
                case 1:
                    if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                            && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                        s.isLive = false;
                        enemyTank.isLive = false;
                        enemyTanks.remove(enemyTank);
                        if (enemyTank instanceof EnemyTank) {
                            Recorder.addALLEnemyTankNum();
                        }
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);
                    }
                    break;
                case 3:
                    if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                            && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                        s.isLive = false;
                        enemyTank.isLive = false;
                        enemyTanks.remove(enemyTank);
                        if (enemyTank instanceof EnemyTank) {
                            Recorder.addALLEnemyTankNum();
                        }
                        Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                        bombs.add(bomb);
                    }
                    break;
            }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //处理wdsa 健
    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            hero.setDirect(0);
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {
            hero.setDirect(3);
            if (hero.getX() > 0) {
                hero.moveLeft();
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下了J,开始射击");
            if(hero.shot == null || !hero.shot.isLive) {
                hero.shotEnemyTank();
            }
//            hero.shotEnemyTank();
   }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            if (hero.shot != null && hero.shot.isLive) {
//                for (int i = 0; i < enemyTanks.size(); i++) {
//                    EnemyTank enemyTank = enemyTanks.get(i);
//                    hitTank(hero.shot, enemyTank);
//                }
//            }
            //敌人坦克是否集中我们
            hitEnemyTank();
            hitHero();
            this.repaint();
        }
    }
}
