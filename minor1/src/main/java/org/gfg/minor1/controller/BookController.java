package org.gfg.minor1.controller;

import org.gfg.minor1.request.CreateBookRequest;
import org.gfg.minor1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/create")
    public void create(@RequestBody CreateBookRequest createBookRequest){
        bookService.create(createBookRequest);
    }
}