package hspedu.tankgame4;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Hero extends Tank {
    Shot shot = null;
    public Hero(int x, int y) {
        super(x, y);
    }
    public void shotEnemyTank() {
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
        new Thread(shot).start();
    }
}
