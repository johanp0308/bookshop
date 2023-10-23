package com.example.bookshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookshop.repositories.enitities.AuthorEntity;
import com.example.bookshop.repositories.enitities.BookEntity;
import com.example.bookshop.services.AuthorService;
import com.example.bookshop.services.BookService;

@RestController
@RequestMapping("/app")
public class UniversalController {
    
    @Autowired
    private BookService bookService;

    @Autowired
    private AuthorService authorService;

    @GetMapping("/books")
    public List<BookEntity> findAllBooks(){
        return bookService.findAll();
    }

    @GetMapping("/book/{isbn}")
    public BookEntity getByIsbn(@PathVariable String isbn){
        return bookService.getByIsbn(isbn);
    }

    @GetMapping("/autores")
    public List<AuthorEntity> findAllAuthors(){
        return (List<AuthorEntity>) authorService.findAll();
    }
}
