package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @projectName: springmvc_demo
 * @package: com.itheima.springmvc
 * @className: UserController
 * @NAME: WANG CHAO
 * @date: 2023/09/02 17:06
 */
@SuppressWarnings({"all"})

@Controller
public class BookController {
    @RequestMapping("/book/save")
    @ResponseBody
    public String save(String name) {
        System.out.println("book save ==>");
        return "{'module':'book save'}";
    }
}
