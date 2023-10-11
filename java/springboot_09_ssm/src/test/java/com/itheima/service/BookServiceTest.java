package com.itheima.service;


import com.itheima.domain.Book;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.service
 * @className: BookServiceTest
 * @NAME: WANG CHAO
 * @date: 2023/09/04 22:51
 */
@SuppressWarnings({"all"})

@SpringBootTest
public class BookServiceTest {
    @Autowired
    private BookService bookService;
    @Test
    public void testGetById(){
        Book book = bookService.getById(2);
        System.out.println(book);
    }
    @Test
    public void testGetAll(){
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }
}
