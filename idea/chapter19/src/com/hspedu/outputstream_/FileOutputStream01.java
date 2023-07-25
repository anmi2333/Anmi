package com.hspedu.outputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class FileOutputStream01 {
    public static void main(String[] args) {

    }
    @Test
    public void writeFile() {
        String filePath = "e:\\a.txt";
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream(filePath);
            fileOutputStream.write('a');
            String str = "hello,world";
            fileOutputStream.write(str.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

