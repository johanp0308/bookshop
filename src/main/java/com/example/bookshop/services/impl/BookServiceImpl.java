package com.example.bookshop.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookshop.repositories.BookRepository;
import com.example.bookshop.repositories.enitities.BookEntity;
import com.example.bookshop.services.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookEntity> findAll() {
        return (List<BookEntity>) bookRepository.findAll();
    }

    @Override
    public BookEntity getById(Long Id) {
        return bookRepository.findById(Id).orElse(null);
    }

    @Override
    public BookEntity save(BookEntity book) {
        return bookRepository.save(book);
    }
    
}
