package com.samet.crudsecurity.service;

import com.samet.crudsecurity.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> findAll();

    Book findById(int id);

    Book save(Book theBook);

    void deleteById(int id);
}
