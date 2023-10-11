package com.hspedu.single_;

public class SingleTon01 {
    public static void main(String[] args) {
        //GirlFriend xh = new GirlFriend("小红");
        //GirlFriend xb = new GirlFriend("小白");
        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
        GirlFriend instance1 = GirlFriend.getInstance();
        System.out.println(instance1);
    }
}

//GirlFriend
//只能有一个女盆友
class GirlFriend {

    private String name;
    private static GirlFriend gf = new GirlFriend("小红红");
    //如何保证我们只能创建一个GirlFriend
    private GirlFriend(String name) {
        this.name = name;
    }

    public static GirlFriend getInstance() {
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}