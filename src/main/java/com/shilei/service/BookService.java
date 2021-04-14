package com.shilei.service;

import com.shilei.doming.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author sl
 * @date 2021/4/13 11:17
 */
public interface BookService {

    int addBook(Books books);

    int deleteBookById(int id);

    int updateBook(Books books);

    Books queryBookById(int id);

    List<Books> queryAllBook();
}
