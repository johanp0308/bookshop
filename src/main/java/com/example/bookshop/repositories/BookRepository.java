package com.example.bookshop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.bookshop.repositories.enitities.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity,Long> {
    
    BookEntity findByIsbn(String isbn);;
}
