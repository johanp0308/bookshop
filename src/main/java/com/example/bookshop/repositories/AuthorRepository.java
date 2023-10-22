package com.example.bookshop.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.bookshop.repositories.enitities.AuthorEntity;

public interface AuthorRepository extends CrudRepository<AuthorEntity,Long> {
    
}
