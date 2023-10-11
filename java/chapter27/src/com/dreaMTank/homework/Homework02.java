package com.dreaMTank.homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {
        String content = "123.89";
        String regStr = "^[-+]?([1-9]\\d*|0)(\\.\\d)?$";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到" + matcher.group(0));
            if (content.matches(regStr)) {
                System.out.println("满足格式");
            } else {
                System.out.println("不满足格式");
            }
        }
    }
}
