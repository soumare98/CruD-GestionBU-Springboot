package com.example.Bibliotheque.bibliotheque.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bibliotheque.bibliotheque.Entities.Autheur;
import com.example.Bibliotheque.bibliotheque.Entities.Book;
import com.example.Bibliotheque.bibliotheque.Model.AutheurModel;
import com.example.Bibliotheque.bibliotheque.Model.BookModel;
import com.example.Bibliotheque.bibliotheque.Service.AutheurService;
import com.example.Bibliotheque.bibliotheque.Service.BookService;
import java.util.List;

@RestController

public class LibraryController {

    @Autowired
    BookService bookService;

    @Autowired
    AutheurService autheurService;

    @RequestMapping(method = RequestMethod.POST, value = "/books")
    public void ceateBook(@RequestBody BookModel b) {
        Book book = new Book();
        book.setTitle(b.getTitle());
        book.setIsbn(b.getIsbn());
        book.setAutheur(this.autheurService.getOnAutheur(b.getAutheur_id()));

        this.bookService.createBook(book);
    }

    @RequestMapping(value = "/books")
    public List<Book> books() {
        return this.bookService.getBook();

    }

    @RequestMapping(value = "/book/{id}")

    public Book getOneBook(@PathVariable Long id) {
        return this.bookService.getOneBook(id);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/book/update/{id}")
    public Book UpdateBook(@PathVariable Long id, @RequestBody BookModel b) {
        Book book = new Book();
        book.setTitle(b.getTitle());
        book.setIsbn(b.getIsbn());
        book.setAutheur(this.autheurService.getOnAutheur(b.getAutheur_id()));
        return this.bookService.UpdateBook(book, id);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/book/delete/{id}")
    public void DeleteBook(@PathVariable Long id) {
        this.bookService.DeleteBook(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/auth")
    public void CreateAuthor(@RequestBody AutheurModel a) {
        Autheur autheur = new Autheur();
        autheur.setName(a.getName());
        this.autheurService.createAuteur(autheur);
    }

    @RequestMapping(value = "/auth")
    public List<Autheur> getAutheur() {
        return this.autheurService.getAutheurs();
    }

    @RequestMapping(value = "/auth/{id}")
    public Autheur getOnAutheur(@PathVariable Long id) {
        return this.autheurService.getOnAutheur(id);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/auth/update/{id}")
    public Autheur UpdateAutheur(@PathVariable Long id, @RequestBody AutheurModel a) {
        Autheur autheur = new Autheur();
        autheur.setName(a.getName());
        return this.autheurService.UpdateAutheur(autheur, id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/auth/delete/{id}")
    public void DeleteAutheur(@PathVariable Long id) {
        this.autheurService.DeleteAutheur(id);
    }

}
