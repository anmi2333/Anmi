package com.hspedu.homework;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class homework02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = "123456";
        String email = "jack@sohu.com";

        try {
            userRegister(name,pwd,email);
            System.out.println("恭喜你，注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    //UserRegister(String name , String email)
    public static void userRegister(String name ,String pwd, String email){
        //第一关 验证名字
        int userLength = name.length();
        if(!(userLength >= 2 && userLength <= 4)) {
            throw  new RuntimeException("用户名长度不对");
        }
        //第二关 验证密码
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("密码长度为6 要求全是数字");
        }
        //第三关 邮箱
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > 0 && j > i)) {
            throw new RuntimeException("要求@必须在.的前面");
        }
    }
    //单独方法验证数字字符
    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
