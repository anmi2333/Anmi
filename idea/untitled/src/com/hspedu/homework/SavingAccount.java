package com.hspedu.homework;

public class SavingAccount extends BankAccount{
    //增加新属性
    private int count = 3;
    private double rate = 0.01;//利率

    public void earnMonthlyInterest(){//每月初我们统计上个月的利息 同时将count=3
        count = 3;//
        super.deposit(getBalance() * rate);
    }
    @Override
    public void deposit(double amount) {//存款
        //判断是否可以免手续费
        if (count > 0) {
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);//一块转入银行账号
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {//取款
        //判断是否可以免手续费
        if (count > 0) {
            super.withdraw(amount);
        }else {
            super.withdraw(amount + 1);//一块转入银行账号
        }
        count--;
    }

    public SavingAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}

