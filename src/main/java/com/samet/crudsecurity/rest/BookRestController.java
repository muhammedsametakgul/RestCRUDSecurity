package com.samet.crudsecurity.rest;

import com.samet.crudsecurity.entity.Book;
import com.samet.crudsecurity.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestController {

    BookService bookService;

    @Autowired
    public BookRestController(BookService bookService){
        this.bookService=bookService;
    }

    //GET ALL BOOKS
    @GetMapping("/books")
    public List<Book> getAll(){

        return bookService.findAll();
    }

    @GetMapping("/books/{bookId}")
    public Book findById(@PathVariable int bookId){
        Book book = bookService.findById(bookId);

        if(book==null){
            throw new RuntimeException("Book Id not found - "+bookId);
        }
        return book;
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody  Book book){

        //to tell Spring that is a POST request
        book.setId(0);

        bookService.save(book);

        return book;
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book){

        bookService.save(book);

        return book;

    }


    //delete the book
    @DeleteMapping("/books/{bookId}")
    public String deleteBook(@PathVariable int bookId){
        Book book = bookService.findById(bookId);

        if(book==null){
            throw new RuntimeException("Id book not found - " +bookId);
        }

        bookService.deleteById(bookId);
        return "Deleted Successfull";
    }


}
