package hspedu.tankgame4;

import java.util.Vector;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class EnemyTank extends Tank {
    Vector<Shot> shots = new Vector<>();

    public EnemyTank(int x, int y) {
        super(x, y);
    }
}
