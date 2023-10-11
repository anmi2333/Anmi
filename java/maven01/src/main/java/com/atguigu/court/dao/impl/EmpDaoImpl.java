package com.atguigu.court.dao.impl;

import com.atguigu.court.dao.BaseDao;
import com.atguigu.court.dao.api.EmpDao;
import com.atguigu.court.entity.Emp;

/**
 * @projectName: maven01
 * @package: com.atguigu.court.dao.impl
 * @className: EmpDaoImpl
 * @NAME: WANG CHAO
 * @date: 2023/08/26 22:44
 */
@SuppressWarnings({"all"})
public class EmpDaoImpl extends BaseDao<Emp> implements EmpDao {
    @Override
    public Emp selectEmpByLoginAccount(String loginAccount, String encodedLoginPassword) {

        // 1、编写 SQL 语句
        String sql = "select emp_id empId," +
                "emp_name empName," +
                "emp_position empPosition," +
                "login_account loginAccount," +
                "login_password loginPassword " +
                "from t_emp where login_account=? and login_password=?";

        // 2、调用父类方法查询单个对象
        return super.getSingleBean(sql, Emp.class, loginAccount, encodedLoginPassword);
    }
}
