package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.service.impl
 * @className: BookServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/04 22:25
 */
@SuppressWarnings({"all"})
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }
    @Override
    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }
    @Override
    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }
    @Override
    public Book getById(Integer id) {
        return bookDao.getById(id);
    }
    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
