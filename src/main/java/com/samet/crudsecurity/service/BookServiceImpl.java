package com.samet.crudsecurity.service;

import com.samet.crudsecurity.dao.BookDAO;
import com.samet.crudsecurity.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service  public class BookServiceImpl implements BookService{

    BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO){
        this.bookDAO=bookDAO;
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id);
    }

    @Override
    @Transactional
    public Book save(Book theBook) {
        return bookDAO.save(theBook);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
    bookDAO.deleteById(id);
    }
}
