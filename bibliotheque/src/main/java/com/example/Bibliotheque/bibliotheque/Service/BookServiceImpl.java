package com.example.Bibliotheque.bibliotheque.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Bibliotheque.bibliotheque.Entities.Book;
import com.example.Bibliotheque.bibliotheque.Repository.BookRepository;


@Service
public class BookServiceImpl implements BookService {

    final private BookRepository bookRepository;
    

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void createBook(Book b) {
        this.bookRepository.save(b);
        
    }

    @Override
    public List<Book> getBook() {
        return this.bookRepository.findAll();
      
    }

    @Override
    public Book getOneBook(Long id) {
        return this.bookRepository.findById(id).get();
       
    }

    @Override
    public Book UpdateBook(Book b, Long id) {
        Book book=this.getOneBook(id);
        book.setTitle(b.getTitle());
        book.setIsbn(b.getIsbn());
        book.setAutheur(b.getAutheur());
       return this.bookRepository.save(book);
       
    }

    @Override
    public void DeleteBook(Long id) {
        
    this.bookRepository.deleteById(id);
        
    }

    
}
