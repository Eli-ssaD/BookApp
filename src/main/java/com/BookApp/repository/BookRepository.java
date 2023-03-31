package com.BookApp.repository;

import com.BookApp.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book, String> {
    List<Book> findByTitleStartsWithOrAuthor(String title, String author);
}

