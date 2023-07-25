package com.hspedu.single_;

public class SingleTon02 {
    public static void main(String[] args) {
        //Cat cat = new Cat("");
    }
}

//希望中程序运行过程中 只能创建一个Cat对象
class Cat {
    private String name;
    private static Cat cat;
    //步骤
    //1.仍然构造器私有化
    //2.定义一个static静态属性对象
    //3.提供一个public的static方法 可以返回一个Cat对象
    private Cat(String name) {
        this.name = name;
    }
    public static Cat getInstance() {

        if (cat == null){//如果还没有创建cat对象
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
