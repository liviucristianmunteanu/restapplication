package ro.itschool.restapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.itschool.restapplication.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}
