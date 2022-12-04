package ro.itschool.restapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.itschool.restapplication.entity.Book;
import ro.itschool.restapplication.repository.BookRepository;

import java.util.List;

@RestController
@RequestMapping(value="/book")
public class MyRestController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping(value="/all")
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
