package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @projectName: mybatisplus_01_quickstart
 * @package: com.itheima.dao
 * @className: UserDao
 * @NAME: WANG CHAO
 * @date: 2023/09/06 16:10
 */
@SuppressWarnings({"all"})
@Mapper
public interface UserDao extends BaseMapper<User> {

}
