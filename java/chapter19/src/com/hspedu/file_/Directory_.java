package com.hspedu.file_;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {

    }
    @Test
    public void m1() {
        String filePath = "d:\\news1.txt";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } else {
            System.out.println("该文件不存在");
        }
    }
}
