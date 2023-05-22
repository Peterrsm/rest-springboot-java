package com.pedro.restspringbootjava.service;

import com.pedro.restspringbootjava.entity.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    List<Book> lista = new ArrayList<>();


    public void addBook(Book book){
        lista.add(book);
    }

    public List<Book> getAllBooks() {
        return lista;
    }

    public List<Book> removeBook(Integer id) {
        lista.removeIf(item -> item.getId().toString().trim().equals(id.toString().trim()));
        return lista;
    }
}
