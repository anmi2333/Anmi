package com.dreaMTank.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String content = "https://www.sohu.com:8080/video/abc/index.htm";
        String regStr = "^([a-zA-Z]+)://([a-zA-Z.]+):(\\d+)[\\w-/]*/([\\w./]+)$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        //while (matcher.matches()) {
           // System.out.println("找到" + matcher.group(0));
            if (matcher.matches()) {
                System.out.println("整体匹配" + matcher.group(0));
                System.out.println("协议: " + matcher.group(1));
                System.out.println("域名: " + matcher.group(2));
                System.out.println("端口: " + matcher.group(3));
                System.out.println("文件: " + matcher.group(4));
            } else {
                System.out.println("没有匹配成功");
            }
        }
    }
//}
