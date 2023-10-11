package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class CollectionMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        //add:添加单个元素
        list.add("jack");
        list.add(10);
        list.add(true);
        System.out.println("list=" + list);
        list.remove(0);
        list.contains("jack");
        System.out.println(list.contains(0));
    }
}
