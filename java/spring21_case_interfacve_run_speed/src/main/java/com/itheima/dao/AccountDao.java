package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface AccountDao {
    @Insert("insert into tab_account(name,money)values(#{name},#{money})")
    void save(Account account);
    @Update("update tab_account set name = #{name}, money = #{money} where id = #{id}")
    void delete(Integer id);
    @Delete("delete from tab_account where id = #{id}")
    void update(Account account);
    @Select("select * from tab_account")
    List<Account> findAll();
    @Select("select * from tab_account where id = #{id}")
    Account findById(Integer id);

}
