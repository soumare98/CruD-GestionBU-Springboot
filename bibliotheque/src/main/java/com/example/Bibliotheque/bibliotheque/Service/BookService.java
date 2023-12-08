package com.example.Bibliotheque.bibliotheque.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Bibliotheque.bibliotheque.Entities.Book;



@Service
public interface BookService {
    void createBook(Book b);
    List<Book> getBook();
    Book getOneBook(Long id);
    Book UpdateBook(Book b , Long id);
    void DeleteBook(Long id);
    
    
}
