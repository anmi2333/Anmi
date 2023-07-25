package com.hspedu.static_;

public class ChildGame {
    public static void main(String[] args) {

        //定义一个变量 count ,统计有多少小孩加入了游戏
        int count = 0;
        Child child01 = new Child("白骨精");
        child01.join();
        count++;

        Child child02 = new Child("狐狸精");
        child02.join();
        count++;

        Child child03 = new Child("老鼠精");
        child03.join();
        count++;
        //===================
        System.out.println("共有" + count + " 名小孩加入了游戏...");
    }
}

class Child {
    private String name;

    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name + " 加入了游戏..");
    }
}
