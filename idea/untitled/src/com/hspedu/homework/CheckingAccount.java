package com.hspedu.homework;

public class CheckingAccount extends BankAccount{
    //属性

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
        //转入银行金额
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
        //转入银行金额
    }
}

