package com.hspedu.list_;


import java.util.ArrayList;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class ListFor {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        list.add("jack");
        list.add("jac");
        list.add("ja");

        for (int i = 0; i < list.size(); i++) {
            System.out.println("对象=" + list.get(i));
        }
    }
}
