package com.hspedu.abstract_;

public class AA extends Template{
    public void job(){
        long start = System.currentTimeMillis();
               long  num = 0;
        for (long i = 0; i < 1000000; i++) {
            num += i;
        }
        long end = System.currentTimeMillis();
        System.out.printf("执行时间 " + (end - start));
    }
}
