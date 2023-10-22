package com.example.bookshop.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bookshop.repositories.AuthorRepository;
import com.example.bookshop.repositories.enitities.AuthorEntity;
import com.example.bookshop.services.AuthorService;

@Service
public class AuthorSeviceImpl implements AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorEntity> findAll() {
        return (List<AuthorEntity>) authorRepository.findAll();
    }

    @Override
    public AuthorEntity getById(Long Id) {
        return authorRepository.findById(Id).orElse(null);
    }

    @Override
    public AuthorEntity save(AuthorEntity author) {
        return authorRepository.save(author);
    }
    
}
