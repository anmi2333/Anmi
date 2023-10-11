package com.itheima.springmvc;

import jdk.nashorn.internal.objects.annotations.Constructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.WebServlet;

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
    @RequestMapping("/save")
    @ResponseBody
    public String save(String name) {
        System.out.println("servlet select name ==>" + name);
        return "{'module':'servlet save'}";
    }
}
