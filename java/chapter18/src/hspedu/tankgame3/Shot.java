package hspedu.tankgame3;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class Shot implements Runnable{
    int x;
    int y;
    int direct;//子弹方向
    int speed = 6;
    boolean isLive = true;//子弹是否还存活

    public Shot(int x, int y, int direct) {
        this.x = x;//子弹横坐标
        this.y = y;//子弹纵坐标
        this.direct = direct;//子弹速度
    }

    @Override
    public void run() {
        while (true){
            try {
                //子弹休眠
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向修改坐标
            switch (direct){
                case 0://up
                  y -= speed;
                  break;
                  case 1://right
                  x += speed;
                  break;
                  case 2://down
                  y += speed;
                  break;
                  case 3://left
                  x -= speed;
                  break;
            }
            System.out.println("子弹 x=" + x + "子弹 y=" + y);
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }
        }
    }
}
