package com.hspedu.enum_.annotation;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Deprecated {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("");
        list.add("");
        list.add("");
        int i;
        System.out.println(list.get(1));
    }
}
