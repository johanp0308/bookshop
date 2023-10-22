package com.example.bookshop.repositories.enitities;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="author")
public class AuthorEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String names;
    private String lastNames;
    private String country;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthdate;

    @OneToMany()
    @JsonIgnoreProperties("books")
    private List<BookEntity> books;
}

