package com.robotdreams.JavaSpringEduClass.JdbcExample.controller;


import com.robotdreams.JavaSpringEduClass.JdbcExample.dto.BookInfoResponseDto;
import com.robotdreams.JavaSpringEduClass.JdbcExample.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/getBookByBookNumber")
    public List<BookInfoResponseDto> getBookByBookNumber(@RequestParam String bookNumber){
        return bookService.getBookByBookNumber(bookNumber);

    }

    @GetMapping("/getBookByCategory")
    public List<BookInfoResponseDto> getBookByCategory(@RequestParam String category){
        return bookService.getBookByCategory(category);

    }
}
