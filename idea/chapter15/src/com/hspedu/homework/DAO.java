package com.hspedu.homework;

import java.util.HashMap;
import java.util.Map;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }
}
