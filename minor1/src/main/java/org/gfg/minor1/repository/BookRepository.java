package org.gfg.minor1.repository;

import org.gfg.minor1.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
