package com.itheima.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @projectName: springboot_01_01_quickstart
 * @package: com.itheima.domain
 * @className: User
 * @NAME: WANG CHAO
 * @date: 2023/09/08 23:12
 */
@SuppressWarnings({"all"})
@Component
@Data
public class User {
 private Integer id;
 private String username;
 private String password;
}
