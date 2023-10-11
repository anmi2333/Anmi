package com.itheima.dao.impl;

import com.itheima.dao.BookDao;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @projectName: spring01
 * @package: com.itheima.dao.impl
 * @className: BookDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/30 21:14
 */
@SuppressWarnings({"all"})

@Component("bookDao")
public class BookDaoImpl implements BookDao {

    public void save() {
        System.out.println("book dao save...");
    }
}
