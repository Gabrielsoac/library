package com.books.library.model.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column
    private String title;

    @Column
    private String author;

    @Column
    private String publishingCompany;

    @Column
    private String ISBN_CODE;

    @Column
    private Boolean active;

    @Column
    private Double rentalPrice;
}
