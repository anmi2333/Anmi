package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @projectName: springmvc_demo
 * @package: com.itheima.springmvc
 * @className: UserController
 * @NAME: WANG CHAO
 * @date: 2023/09/02 17:06
 */
@SuppressWarnings({"all"})

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_OK:Code.SAVE_ERR,flag);
    }
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_OK:Code.UPDATE_ERR,flag);
    }
    @DeleteMapping("{#id}")
    public Result delete(@PathVariable Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_OK:Code.DELETE_ERR,flag);
    }
    @GetMapping("{#id}")
    public Result getById(@PathVariable Integer id) {
        Book book = bookService.getById(id);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "" : "数据查询失败,清重试";
        return new Result(code,book,msg);
    }
    @GetMapping
    public Result getAll() {
        List<Book> booklist = bookService.getAll();
        Integer code = booklist != null ? Code.GET_OK : Code.GET_ERR;
        String msg = booklist != null ? "" : "数据查询失败,清重试";
        return new Result(code,booklist,msg);
    }
}
