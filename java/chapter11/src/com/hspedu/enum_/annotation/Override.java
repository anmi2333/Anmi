package com.hspedu.enum_.annotation;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Override {
    public static void main(String[] args) {

    }
}

class Father {
    public void fly(){
        System.out.println("Father fly...");
    }
}

class Son extends  Father {
    @java.lang.Override
    public void fly() {
        super.fly();
    }
}
