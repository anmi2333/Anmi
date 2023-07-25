package com.hspedu.homework;

public class Homework08 {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(1000);
        checkingAccount.deposit(10);//1010-1=1009
        System.out.println(checkingAccount.getBalance());

        //测试SavingsAccount
        SavingAccount savingAccount = new SavingAccount(1000);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//1300
        savingAccount.deposit(100);
        System.out.println(savingAccount.getBalance());//1400-1=1399

        //月初,定时器自动调用earnMonthlyInterest
        savingAccount.earnMonthlyInterest();//统计利息
        System.out.println(savingAccount.getBalance());//1399+13.99=1412.99
        savingAccount.withdraw(100);//免手续费
        System.out.println(savingAccount.getBalance());//1412.99 - 100 =1312.99
        savingAccount.withdraw(100);
        savingAccount.withdraw(100);


    }
}
