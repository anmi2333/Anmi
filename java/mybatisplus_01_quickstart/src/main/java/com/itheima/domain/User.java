package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.*;

/**
 * @projectName: mybatisplus_01_quickstart
 * @package: com.itheima.domain
 * @className: User
 * @NAME: WANG CHAO
 * @date: 2023/09/06 16:08
 */
@SuppressWarnings({"all"})
@Data
@TableName("tbl_user")
public class User {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    private String name;
    @TableField(value = "password")
    private String password;
    private Integer age;
    private String tel;
    @TableLogic
    private Integer deleted;
}
