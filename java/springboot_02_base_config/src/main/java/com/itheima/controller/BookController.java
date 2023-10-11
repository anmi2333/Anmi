package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: springboot_01_quickstart
 * @package: com.itheima.controller
 * @className: BookController
 * @NAME: WANG CHAO
 * @date: 2023/09/05 22:02
 */
@SuppressWarnings({"all"})

@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("id ==>" + id);
        return "hello , spring boot!";
    }
}
