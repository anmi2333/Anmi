package com.atguigu.court.service.impl;

import com.atguigu.court.dao.api.EmpDao;
import com.atguigu.court.dao.impl.EmpDaoImpl;
import com.atguigu.court.entity.Emp;
import com.atguigu.court.exception.LoginFailedException;
import com.atguigu.court.service.api.EmpService;
import com.atguigu.court.util.ImperialCourtConst;
import com.atguigu.court.util.MD5Util;

/**
 * @projectName: maven01
 * @package: com.atguigu.imperial.court.servlet.module
 * @className: EmpServiceImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/29 10:08
 */
@SuppressWarnings({"all"})
public class EmpServiceImpl implements EmpService {

    private EmpDao empDao = new EmpDaoImpl();

    @Override
    public Emp getEmpByLoginAccount(String loginAccount, String loginPassword) {

        // 1、对密码执行加密
        String encodedLoginPassword = MD5Util.encode(loginPassword);

        // 2、根据账户和加密密码查询数据库
        Emp emp = empDao.selectEmpByLoginAccount(loginAccount, encodedLoginPassword);

        // 3、检查 Emp 对象是否为 null
        if (emp != null) {
            //	①不为 null：返回 Emp
            return emp;
        } else {
            //	②为 null：抛登录失败异常
            throw new LoginFailedException(ImperialCourtConst.LOGIN_FAILED_MESSAGE);
        }
    }
}
