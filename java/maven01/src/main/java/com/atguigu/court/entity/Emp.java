package com.atguigu.court.entity;

/**
 * @projectName: maven01
 * @package: com.atguigu.court.entity
 * @className: Emp
 * @NAME: WANG CHAO
 * @date: 2023/08/25 21:49
 */
@SuppressWarnings({"all"})
public class Emp {

    private Integer empId;
    private String empName;
    private String empPosition;
    private String loginAccount;
    private String loginPassword;

    public Emp() {

    }
    public Emp(Integer empId, String empName, String empPosition, String loginAccount, String loginPassword) {
        this.empId = empId;
        this.empName = empName;
        this.empPosition = empPosition;
        this.loginAccount = loginAccount;
        this.loginPassword = loginPassword;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpPosition() {
        return empPosition;
    }

    public void setEmpPosition(String empPosition) {
        this.empPosition = empPosition;
    }

    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empPosition='" + empPosition + '\'' +
                ", loginAccount='" + loginAccount + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                '}';
    }
}
