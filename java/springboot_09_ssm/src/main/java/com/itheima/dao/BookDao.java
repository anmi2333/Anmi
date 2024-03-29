package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookDao {
    //@Insert("insert into tbl_book values(null,#{type},#{name},#{description})")
    @Insert("insert into tbl_book (type,name,description) values(#{type},#{name},#{description})")
    public void save(Book book);
    @Update("update set tbl_book set type=#{type}, name=#{name}, description=#{description} where id = #{id}")

    public void update(Book book);
    @Delete("delete from tbl_book where id = #{id}")

    public void delete(Integer id);
    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);
    @Select("select * from tbl_book")
    public List<Book> getAll();

}
