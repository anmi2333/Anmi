package cn.itcast.dao;

import cn.itcast.domain.User;

import java.util.List;

/**
 * 用户操作Dao
 * */

public interface UserDao {
    public List<User> findAll();
}
