package com1.itheima.service.impl;

import com1.itheima.controller.Code;
import com1.itheima.dao.BookDao;
import com1.itheima.domain.Book;
import com1.itheima.exception.BusinessException;
import com1.itheima.service.BookService;
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

    public boolean save(Book book) {
        bookDao.save(book);
        return true;
    }

    public boolean update(Book book) {
        bookDao.update(book);
        return true;
    }

    public boolean delete(Integer id) {
        bookDao.delete(id);
        return true;
    }

    public Book getById(Integer id) {
        if (id == 1) {
            throw new BusinessException(Code.BUSINESS_ERR, "请不要使用你的技术挑战我的耐性!");
        }
//            try{
//                int i = 1/0;
//            }catch (Exception e){
//                throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时,请重试",e);
//            }
        return bookDao.getById(id);
    }

    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
