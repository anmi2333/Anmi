package com.atguigu.court.service.api;

import com.atguigu.court.entity.Emp;

public interface EmpService {
    Emp getEmpByLoginAccount(String loginAccount, String loginPassword);
}
