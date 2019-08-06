package com.example.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import com.example.dto.Book;

public interface BookService {

    Book save(Book book);

    void delete(Book book);

    Book findOne(String id);

    Iterable<Book> findAll();

    Page<Book> findByAuthor(String author, PageRequest pageRequest);

    Page<Book> findByTitle(String title, PageRequest pageRequest);

}