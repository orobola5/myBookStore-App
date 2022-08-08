 package com.example.mybookstore.Service;

import com.example.mybookstore.BookRepository;
import com.example.mybookstore.book.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public Iterable<Book> findAll() {

        return repository.findAll();
    }

    public void save(Book book) {
        repository.save(book);
    }

    public List<Book> search(String term) {
        return repository.findByNameContaining(term);
    }

    public Optional<Book>findOne(Long id) {
        Optional<Book> book =repository.findById(id);
        return book;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
