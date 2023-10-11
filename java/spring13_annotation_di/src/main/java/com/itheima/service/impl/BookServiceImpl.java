package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @projectName: spring03_bean_instance
 * @package: com.itheima.service.impl
 * @className: BookServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/31 21:39
 */
@SuppressWarnings({"all"})

@Repository("bookService")
public class BookServiceImpl implements BookService {
 @Autowired
 @Qualifier("bookService")
 private BookService bookService;

 public void save() {
  System.out.println("book service save...");
 }
}
