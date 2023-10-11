package com.itheima.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: springboot_01_01_quickstart
 * @package: com.itheima.controller
 * @className: BookController
 * @NAME: WANG CHAO
 * @date: 2023/09/09 10:39
 */
@SuppressWarnings({"all"})
@RestController
@RequestMapping("/books")
public class BookController {
 @Value("${country}")
 private String country1;

 @Value("${user.name}")
 private String name1;

 @GetMapping
 public String getById() {
  System.out.println("springboot is running...");
  System.out.println("country1===>"+country1);
  System.out.println("name1===>"+name1);
  return "springboot is running";
 }
}
