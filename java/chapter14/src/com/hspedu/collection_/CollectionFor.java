package com.hspedu.collection_;

import java.util.ArrayList;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class CollectionFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        ArrayList col = new ArrayList();

        col.add(new Book(" 三国演义" , "罗贯中" , 10.1));
        col.add(new Book(" 小李飞刀" , "古龙" , 5.1));
        col.add(new Book(" 红楼梦" , "曹雪芹" , 34.6));

        //使用增强for
        for (Object book : col) {
            System.out.println("book=" + book);
        }

    }
}
