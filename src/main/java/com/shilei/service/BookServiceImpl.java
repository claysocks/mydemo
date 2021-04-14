package com.shilei.service;

import com.shilei.dao.BookMapper;
import com.shilei.doming.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sl
 * @date 2021/4/13 11:19
 */
@Service
public class BookServiceImpl implements BookService{

    //service 调dao层，组合dao
    //使用注解
    @Autowired
    private BookMapper bookMapper;

    @Override
    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }
}
