package ro.itschool.restapplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping
    public void saveBook(@RequestBody Book book) {
        bookRepository.save(book);
    }

    @DeleteMapping(value = "{id}")
    public void deleteCar(@PathVariable long id){
        bookRepository.deleteById(id);
    }

    @PutMapping(value="/update")
    public void updateBook(@RequestBody Book newBook){
        if (newBook.getId() == null){
            throw new RuntimeException("Book not found!");
        }
        bookRepository.save(newBook);
    }
}
