package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @projectName: springboot_01_quickstart
 * @package: com.itheima.service.impl
 * @className: BookServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/06 10:54
 */
@SuppressWarnings({"all"})
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is runing...");
    }
}
