package com.example.mybookstore.book;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "books")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id",nullable = false)
    private Long id;
    @Column(name = "name",nullable = false)
    private String name;
    @Column(name = "price",nullable = false)
    private BigDecimal price;
    @Column(name = "author",nullable = false)
    private  String author;
    @Column(name = "isbn",nullable = false)
    private  String isbn;
    @Column(name = "publisher",nullable = false)
    private String publisher;
    @Column(name = "publishedOn",nullable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate publishedOn;

    public Book(Long id,
                String name,
                BigDecimal price,
                String author,
                String isbn,
                String publisher,
                LocalDate publishedOn) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.publishedOn = publishedOn;
    }

    public Book(){
        super();
    }


}
