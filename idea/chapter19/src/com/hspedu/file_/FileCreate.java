package com.hspedu.file_;

import java.io.File;
import java.io.IOException;

/**
 * @ author WANG CHAO
 * @ version 1.0
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //1
    public void create01(){
        String filePath = "e::\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
