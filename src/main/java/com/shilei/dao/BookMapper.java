package com.shilei.dao;

import com.shilei.doming.Books;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * @Author sl
 * @date 2021/4/13 10:46
 */
@MapperScan
public interface BookMapper {
    //增删改查

    int addBook(Books books);

    int deleteBookById(@Param("id") int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();



}
