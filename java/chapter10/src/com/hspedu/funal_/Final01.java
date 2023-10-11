package com.hspedu.funal_;

public class Final01 {
    public static void main(String[] args) {

    }
}

class A {

}
class B extends A {

}

class C {
    //hi不能被子类重写
    //可以使用final修饰
    public void hi(){

    }
}

class D extends C {
    @Override
    public void hi() {
        super.hi();
    }
}