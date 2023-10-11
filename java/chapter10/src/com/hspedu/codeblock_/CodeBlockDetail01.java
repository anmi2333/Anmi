package com.hspedu.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //01
        AA aa = new AA();
        //02
        BB bb = new BB();
        //03
    }
}

class AA{
    //静态
    static {
        System.out.println("AA 的静态代码块被执行...");
    }
}

class BB extends AA{
    {
        System.out.println();
    }

}

class CC extends BB {
    static {
        System.out.println();
    }
    {
        System.out.println();
    }
}