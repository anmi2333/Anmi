package com.hspedu.threaduse;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Thread01 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.start();
    }
}

class Cat extends Thread {
    @Override
    public void run() {
        int a = 0;
        while (true) {
            System.out.println("原神 启动第" + ++a + "次" );
            //ctrl + alt + t
            try {
                Thread.sleep(100 );
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (a == 80){
                break;
            }
        }
    }
}
