package com.hspedu.homework;

public class Manager extends Employee{
    //特有属性
    private double bonus;
    //创建Manager对象时,奖金是多少并不是确定的,因为老师在构造器中,不给bonus
    //,可以通过setBonus
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        //因为经理的工资计算方式和Employee不一样 所以我们重写
        System.out.println("经理" + getName() + " 工资是="
            + (bonus + getDaySal() * getWorkDays() * getGrade()));
        //super.printSal();
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
