package com.hspedu.homework;

public class Worker extends Employee{
        //分析普通员工没有特别属性
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }
    //重写printSal

    @Override
    public void printSal() {//因为普通员工和Employee工资情况一样 所以直接调用父类printSal()
        super.printSal();
    }
}

