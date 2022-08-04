package com.example.mybookstore.book;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public LocalDate getPublishedOn() {
        return publishedOn;
    }

    public void setPublishedOn(LocalDate publishedOn) {
        this.publishedOn = publishedOn;
    }
}
