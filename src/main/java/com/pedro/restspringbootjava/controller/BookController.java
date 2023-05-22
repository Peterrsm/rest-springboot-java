package com.pedro.restspringbootjava.controller;

import com.pedro.restspringbootjava.entity.Book;
import com.pedro.restspringbootjava.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @GetMapping("/")
    public List<Book> getAllBooks(){
        return service.getAllBooks();
    }

    @PostMapping("/addBook")
    public void addBook(Book book) {
        service.addBook(book);
    }

    @DeleteMapping("/remove/{id}")
    public List<Book> removeBook(@PathVariable("id") Integer id){
        return service.removeBook(id);
    }

}
