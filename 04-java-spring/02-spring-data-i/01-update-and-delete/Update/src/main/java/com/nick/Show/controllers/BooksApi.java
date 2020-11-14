package com.nick.Show.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nick.Show.models.Book;
import com.nick.Show.services.BookService;

@RestController
public class BooksApi {
	
    private final BookService bookService;
    public BooksApi(BookService bookService){
        this.bookService = bookService;
    }
    @RequestMapping("/api/books")
    public List<Book> index() {
        return this.bookService.allBooks();
    }
    
    @RequestMapping(value="/api/books", method=RequestMethod.POST)
    public Book create(@RequestParam(value="title") String title, @RequestParam(value="description") String desc, @RequestParam(value="language") String lang, @RequestParam(value="pages") Integer numOfPages) {
        Book book = new Book(title, desc, lang, numOfPages);
        return bookService.createBook(book);
    }
    
    @RequestMapping("/api/books/{id}")
    public Book show(@PathVariable("id") Long id) {
        Book book = bookService.findBook(id);
        return book;
    }
    
//    @PutMapping("/api/update/{id}")
//    public Book update(@PathVariable("id") Long id, Book updatedBook) {
//        Book book = this.bookService.updateBook(updatedBook);
//        return book;
//    }
//    
    @DeleteMapping("/api/books/{id}")
    public void destroy(@PathVariable("id") Long id) {
        this.bookService.destroyBook(id);
    }
}
