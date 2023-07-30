package com.samet.crudsecurity.dao;

import com.samet.crudsecurity.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> findAll();

    Book findById(int id);

    Book save(Book theBook);

    void deleteById(int id);
}
