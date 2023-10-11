package com.hspedu.homework;

import java.util.ArrayList;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
@SuppressWarnings("all")
public class Homework01 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("熱中症にならないように　部活動でウェアラブル端末の実験"));
        arrayList.add(new News("夏休みを安全に楽しんで　子どもたちが交通のルールを勉強"));

        int size = arrayList.size();
        for (int i = size - 1; i >= 0 ;i--){
            News news = (News)arrayList.get(i);
            System.out.println(processTitle(news.getTitle( )));
        }
    }

    //专门写一个方法处理新闻标题
    public static String processTitle(String title){
        if (title == null) {
            return "";
        }
        if (title.length() > 15) {
            return title.substring(0,15) + "...";
        } else {
            return title;
        }
    }
}

class News {
    private String title;
    private String content;

    public News(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                '}';
    }
}
