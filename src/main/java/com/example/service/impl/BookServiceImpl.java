package com.example.service.impl;

import com.example.dto.Book;
import com.example.repository.BookRepository;
import com.example.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    @Qualifier("bookRepository")
    private BookRepository bookRepository;


    @Override
    public Book save(Book blog) {
        return bookRepository.save(blog);
    }

    @Override
    public void delete(Book blog) {
        bookRepository.delete(blog);
    }

    @Override
    public Book findOne(String id) {
        return bookRepository.findById(id).get();
    }

    @Override
    public List<Book> findAll() {
        return (List<Book>) bookRepository.findAll();
    }

    @Override
    public Page<Book> findByAuthor(String author, PageRequest pageRequest) {
        return bookRepository.findByAuthor(author,pageRequest);
    }

    @Override
    public Page<Book> findByTitle(String title, PageRequest pageRequest) {
        return bookRepository.findByTitle(title,pageRequest);
    }
}
