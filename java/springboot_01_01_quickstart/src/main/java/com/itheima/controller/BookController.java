package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: springboot_01_01_quickstart
 * @package: com.itheima.controller
 * @className: BookController
 * @NAME: WANG CHAO
 * @date: 2023/09/08 16:53
 */
@SuppressWarnings({"all"})
//Rest
@RestController
@RequestMapping("/books")
public class BookController {
     @GetMapping
     public String getById() {
          System.out.println("springboot is runing...");
          return "springboot is running...";
     }
}
