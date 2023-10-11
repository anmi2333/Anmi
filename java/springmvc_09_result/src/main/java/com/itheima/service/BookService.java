package com.itheima.service;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface BookService {
    //保存
    public boolean save(Book book);
    //修改
    public boolean update(Book book);
    //按id删除
    public boolean delete(Integer id);
    //按id查询
    public Book getById(Integer id);
    //查询全部
    public List<Book> getAll();
}
