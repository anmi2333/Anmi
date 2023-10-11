package com.itheima.service.impl;

import com.itheima.domian.User;
import com.itheima.service.UserService;

/**
 * @projectName: springmvc_01_quickstart
 * @package: com.itheima.service.impl
 * @className: UserServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/02 21:50
 */
@SuppressWarnings({"all"})
public class UserServiceImpl implements UserService {
    public void save(User user) {
        System.out.println("user service...");
    }
}
