package com.deamTank.smallchange.oop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
该类是完成零钱通的各个功能的类
使用OPP的面向对象编程
将各个功能对应一个方法
        */
public class SmallChangeSysOOP {
    //属性..
    //1.定义相关变量
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key ="";

    //2.完成零钱通明细
    //老韩思路,(1)可以把收益入账和消费,保存到数组(2)可以使用对象（3）简单到花累使用string拼接
    String details =  "--------零钱通明细--------";
    //3.收益入账 完成功能驱动程序员增加新的变化代码
    //老韩思路，定义新的变量
    double money = 0;
    double balance = 0;
    Date date = null;//表示日期
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化的

    //4.消费
    //定义新变量，保存消费的原因
    String note = "";
    //先完成显示菜单 并可以选择
    public void mainMenu() {
        do {
            System.out.println("\n===========零钱通菜单(OOP)==========");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费");
            System.out.println("\t\t\t4.退     出");

            System.out.println("请选择(1-4): ");
            key = scanner.next();

            //使用switch分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                case "3":
                    this.pay();
                    break;
                case "4":
                  this.exit();
                default:
                    System.out.println("菜单选择有误，请重新选择");
            }
        }while (loop);
    }
    //完成零钱通类¥明细
    public void detail(){
        System.out.println(details);
    }
    //完成收益入账
    public void income(){
        System.out.println("收益入账金额");
        money = scanner.nextDouble();
        //money的值的范围应该校验 一会再完善
        //找出不正确金额条件 然后给出提示 直接return
        if (money  <= 0) {
            System.out.println("收益入账金额 需要大于0");
            return;//退出方法 不再执行后面方法
        }
        balance += money;
        //将信息拼接到details
        date = new Date();//获取当前到日期
        //System.out.println(sdf.format(date));
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    public void pay(){
        System.out.println("消费金额");
        money = scanner.nextDouble();
        //money 的值的范围应该是校验 -》 一会完善
        //找出不正确金额
        if (money <= 0 || money > balance){
            System.out.println("你的消费金额 应该在 0-" + balance);
            return;
        }
        System.out.println("消费说明");
        note = scanner.next();
        balance -= money;
        //拼接消费信息到 details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }
    //退出
    public void exit(){
        System.out.println("4.退     出");
        //用户输入4退出时,给你提示"你确定要退出吗？ y/n, 必须输入正确到y/n,
        // 否则循环输入指令,直到输入y或者n"
        //（1）定义一个变量 choice,接收用户的输入
        //（2）while + break 来处理接收输入时的y或者n
        //（3）退出while后,再判断choice是y还是n,就可以决定是否退出
        //（4)一段代码,完成一个小功能,尽量不要混在一起
        String choice = "";
        while (true) {//要求用户必须输入y/n,否则就一直循环
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }
        //当用户退出while后 进行判断
        if (choice.equals("y")){
            loop = false;
        }
    }
}
