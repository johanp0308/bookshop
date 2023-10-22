package com.example.bookshop.services;

import java.util.List;

import com.example.bookshop.repositories.enitities.BookEntity;

public interface BookService {
    
    List<BookEntity> findAll();

    BookEntity getById(Long Id);

    BookEntity save(BookEntity book);

    
}
