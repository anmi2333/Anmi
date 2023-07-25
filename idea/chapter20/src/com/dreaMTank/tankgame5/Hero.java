package com.dreaMTank.tankgame5;

import java.util.Vector;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Hero extends Tank {
    Shot shot = null;
    //可以发射多棵子弹
    Vector<Shot> shots = new Vector<>();
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank() {
        if (shots.size() == 5) {
            return;
        }
        //根据当前hero
        switch (getDirect()) {
            case 0://up
                shot = new Shot(getX() + 20,getY(),0);
                break;
            case 1://right
                shot = new Shot(getX() + 60,getY() + 20,1);
                break;
            case 2://down
                shot = new Shot(getX() + 20,getY() + 60,2);
                break;
            case 3://left
                shot = new Shot(getX(),getY() + 20,3);
                break;
        }
        //新建的shot放到shots

        new Thread(shot).start();
    }
}
