package com.example.bookstore.controllers;

import com.example.bookstore.models.Book;
import com.example.bookstore.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public String showBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books";
    }

    @GetMapping("/books/{id}")
    public String showBookDetails(@PathVariable Long id, Model model) {
        Book book = bookRepository.findById(id).orElse(null);
        if (book == null) return "redirect:/books"; // fallback
        model.addAttribute("book", book);
        return "book-details";
    }
}
