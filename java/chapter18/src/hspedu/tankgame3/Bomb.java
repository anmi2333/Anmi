package hspedu.tankgame3;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Bomb {
    int x, y;//炸弹坐标
    int life = 5;
    boolean isLive = true;

    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void lifeDown() {
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
