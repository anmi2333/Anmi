package com.itheima.dao;

import com.itheima.domian.User;
import org.apache.ibatis.annotations.Insert;

public interface UserDao {
    @Insert("insert into tbl_user(name,agr)values(#{name},#{age})")
    public void save(User user);
}
