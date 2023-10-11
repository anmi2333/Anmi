package com.itheima.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.entity.User;
import com.itheima.reggie.mapper.EmployeeMapper;
import com.itheima.reggie.mapper.UserMapper;
import com.itheima.reggie.service.EmployeeService;
import com.itheima.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.service.impl
 * @className: EmployeeServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/09/14 16:55
 */
@SuppressWarnings({"all"})
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
