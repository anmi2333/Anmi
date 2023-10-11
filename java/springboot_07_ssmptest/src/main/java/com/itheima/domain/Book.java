package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @projectName: springboot_01_01_quickstart
 * @package: com.itheima.domain
 * @className: Book
 * @NAME: WANG CHAO
 * @date: 2023/09/09 14:01
 */
@SuppressWarnings({"all"})
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@TableName("tbl_book")
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
