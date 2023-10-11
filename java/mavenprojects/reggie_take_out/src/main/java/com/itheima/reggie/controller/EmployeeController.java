package com.itheima.reggie.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.reggie.common.R;
import com.itheima.reggie.entity.Employee;
import com.itheima.reggie.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.reggie.controller
 * @className: EmployeeController
 * @NAME: WANG CHAO
 * @date: 2023/09/14 16:58
 */
@SuppressWarnings({"all"})
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    //员工登录
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){
     //1.将页面密码加密处理
     String password = employee.getPassword();
     password = DigestUtils.md5DigestAsHex(password.getBytes());
     //2.根据页面提交的用户名username查询数据库
     LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
     queryWrapper.eq(Employee::getUsername,employee.getUsername());
     Employee emp = employeeService.getOne(queryWrapper);
     //3.如果没有查询到则返回登录失败结果
     if (emp == null) {
      return R.error("登录失败");
     }
     //4.密码比对,如果不一致则返回登录失败结果
     if (!emp.getPassword().equals(password)) {
      return R.error("登录失败");
     }
     //5.查看员工状态,如果为已禁用状态,则返回员工已禁用结果
     if (emp.getStatus() == 0) {
      return R.error("账户已禁用");
     }
     //6.登录成功,将员工id存入session并返回成功结果
     request.getSession().setAttribute("employee",emp.getId());
     return R.success(emp);
    }

    @PostMapping("/logout")
    public R<String> logout(HttpServletRequest request) {
        //清理Session中保存的当前员工id
        request.getSession().removeAttribute("employee");
        return R.success("退出成功");
    }

    //新增员工
    @PostMapping
    public R<String> save(HttpServletRequest request,@RequestBody Employee employee) {
        log.info("新增员工, 员工信息",employee.toString());

        //设置初始密码123456 md5加密
        employee.setPassword(DigestUtils.md5DigestAsHex("123456".getBytes()));

        employee.setCreateTime(LocalDateTime.now());
        employee.setUpdateTime(LocalDateTime.now());
        //获得当前用户登录的id
        LocalDateTime empId = (LocalDateTime) request.getSession().getAttribute("employee");

        employee.setCreateTime(empId);
        employee.setUpdateTime(empId);

        employeeService.save(employee);

        return R.success("新增员工成功");
    }

    @GetMapping("/page")
    public R<Page> page(int page,int pageSize,String name) {
        log.info("page = {}, pageSize = {}, name = {}",page,pageSize,name);

        //构造分页构造器
        Page pageInfo = new Page(page,pageSize);

        //构造条件构造器
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper();
        //添加过滤条件
        queryWrapper.like(StringUtils.hasText(name),Employee::getName,name);
        //添加排序条件
        queryWrapper.orderByDesc(Employee::getCreateTime);
        //执行查询
        employeeService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }

    //根据id修改员工信息
    @PutMapping
    public R<String> update(HttpServletRequest request ,@RequestBody Employee employee) {
        log.info(employee.toString());

        long id = Thread.currentThread().getId();
        log.info("线程id为: {}",id);
//        Long empId = (Long) request.getSession().getAttribute("employee");
//        employee.setUpdateTime(LocalDateTime.now());
//        employee.setUpdateUser(empId);
        employeeService.updateById(employee);
        return R.success("员工信息修改成功");
    }

    public R<Employee> getById(@PathVariable Long id) {
        log.info("根据id查询员工信息...");
        Employee employee = employeeService.getById(id);
        if (employee != null){
        return R.success(employee);
        }
        return R.error("没有查询到对应信息");
    }
}
