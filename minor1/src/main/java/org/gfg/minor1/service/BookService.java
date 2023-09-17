package org.gfg.minor1.service;

import org.gfg.minor1.models.Author;
import org.gfg.minor1.models.Book;
import org.gfg.minor1.repository.AuthorRepository;
import org.gfg.minor1.repository.BookRepository;
import org.gfg.minor1.request.CreateBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    public void create(CreateBookRequest createBookRequest) {
        Book book = createBookRequest.to();
        // condition that we need to check whether we need to save it in our db or not

        // here u need to have same method present in author repo which will tell
        Author authorFromDB = authorRepository.findByEmail(book.getAuthor().getEmail());
        if(authorFromDB == null){
            authorFromDB = authorRepository.save(book.getAuthor());
        }

        bookRepository.save(book);
    }
}
