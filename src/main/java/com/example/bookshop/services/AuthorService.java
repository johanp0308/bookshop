package com.example.bookshop.services;

import java.util.List;

import com.example.bookshop.repositories.enitities.AuthorEntity;

public interface AuthorService {

    List<AuthorEntity> findAll();

    AuthorEntity getById(Long Id);

    AuthorEntity save(AuthorEntity author);

}
