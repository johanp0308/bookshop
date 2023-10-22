package com.example.bookshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.bookshop.repositories.enitities.BookEntity;
import com.example.bookshop.services.BookService;

@RestController
@RequestMapping("/app")
public class UniversalController {
    
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }
}
