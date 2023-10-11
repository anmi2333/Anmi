package com.hspedu.exit_;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class ThreadExit {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();
        //t.exit();
        System.out.println("main线程休息10s...");
        Thread.sleep(10 * 1000);
        t.setLoop(false);
    }
}

class T extends Thread {
    private int i = 0;
    public boolean loop = true;
    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("AThread 运行中..." + (++i));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
