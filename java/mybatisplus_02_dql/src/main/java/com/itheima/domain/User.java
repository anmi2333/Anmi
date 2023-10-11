package com.itheima.domain;

import lombok.*;

/**
 * @projectName: mybatisplus_01_quickstart
 * @package: com.itheima.domain
 * @className: User
 * @NAME: WANG CHAO
 * @date: 2023/09/06 16:08
 */
@SuppressWarnings({"all"})
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class User {
    private Long id;
    private String name;
    private String password;
    private Integer age;
    private String tel;

}
