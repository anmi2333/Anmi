package com.itheima.test;

import org.junit.jupiter.api.Test;

/**
 * @projectName: reggie_take_out
 * @package: com.itheima.test
 * @className: UploadFileTest
 * @NAME: WANG CHAO
 * @date: 2023/09/16 17:18
 */
@SuppressWarnings({"all"})
public class UploadFileTest {
    @Test
    public void test1() {
        String fileName = "ererewe.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.println(suffix);
    }
}
