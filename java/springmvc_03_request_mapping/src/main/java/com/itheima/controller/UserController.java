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
public class UserController {
    @RequestMapping("/user/save")
    @ResponseBody
    public String save(String name) {
        System.out.println("user save ==>");
        return "{'module':'user save'}";
    }

    @RequestMapping("/users/delete")
    @ResponseBody
    public String delete(String name) {
        System.out.println("user delete ==>");
        return "{'module':'user delete}";
    }
}
