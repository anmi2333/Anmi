package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.exception.SystemException;
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
//        if (id == 1) {
//            throw new BusinessException(Code.BUSINESS_ERR, "请不要使用你的技术挑战我的耐性!");
//        }
//            try{
//                int i = 1/1;
//            }catch (Exception e){
//                throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时,请重试",e);
//            }
        return bookDao.getById(id);
    }
    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
