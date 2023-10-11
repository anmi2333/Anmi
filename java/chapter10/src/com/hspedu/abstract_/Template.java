package com.hspedu.abstract_;

abstract public class Template {//抽象类 模版设计模式

    public abstract void job();//抽象方法

    public void calculateTime(){
        //得到开始时间
        long start = System.currentTimeMillis();
        job();
        //得到结束时间
        long end = System.currentTimeMillis();
        System.out.println("AA 执行时间" + (end - start));
    }
}
