package com.robotdreams.JavaSpringEduClass.JdbcExample.service;


import com.robotdreams.JavaSpringEduClass.JdbcExample.dto.BookInfoResponseDto;
import com.robotdreams.JavaSpringEduClass.JdbcExample.repository.BookMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private final JdbcTemplate jdbcTemplate;


    public BookService(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List <BookInfoResponseDto>  getBookByBookNumber(String bookNumber) {
         List <BookInfoResponseDto> query = jdbcTemplate.query("SELECT * FROM BOOKS B WHERE B.BOOKNUMBER = ? " , new Object[]{bookNumber}, new BookMapper());
         return query;
    }


    public List<BookInfoResponseDto> getBookByCategory (String category){
        List<BookInfoResponseDto> query = jdbcTemplate.query("SELECT * FROM BOOKS B WHERE B.CATEGORY = ?", new Object[]{category}, new BookMapper());
        return query;
    }







}
