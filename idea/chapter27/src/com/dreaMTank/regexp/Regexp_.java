package com.dreaMTank.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Regexp_ {
    public static void main(String[] args) {
        // 爬虫 得到如下文本
        String content = "Java 是一个通用术语，用于表示 Java 软件及其组件，" +
                "包括“Java 运行时环境 (JRE)”、“Java 虚拟机 (JVM)”以及“插件”。 [1]\n" +
                "Java具有大部分编程语言所共有的一些特征，被特意设计用于互联网的分布式环境。" +
                "Java具有类似于C++语言的形式和感觉，但它要比C++语言更易于使用，" +
                "而且在编程时彻底采用了一种以对象为导向的方式。\n" +
                "Java版本指的是 Java 系列和更新编号。示例：在网站上或者 Windows 程序中，" +
                "版本显示为 Java 8 Update 25。旧版本也可显示为 1.7.0_65，这表示 Java 7 Update 65。\n";
        //1.先创建一个对象 模式对象 正则表达式
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        //2.创建一个匹配对象
        Matcher matcher = pattern.matcher(content);
        //3.开始循环匹配
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
