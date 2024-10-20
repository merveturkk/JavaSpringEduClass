package com.robotdreams.JavaSpringEduClass.JdbcExample.repository;

import com.robotdreams.JavaSpringEduClass.JdbcExample.dto.BookInfoResponseDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class BookMapper implements RowMapper<BookInfoResponseDto> {

        public BookInfoResponseDto mapRow(ResultSet rs, int rowNum) throws SQLException {
            BookInfoResponseDto book = new BookInfoResponseDto();
            book.setBookNumber(rs.getString("BOOKNUMBER"));
            book.setName(rs.getString("NAME"));
            book.setCategory(rs.getString("CATEGORY"));
            book.setDescription(rs.getString("DESCRIPTION"));
            book.setPrice(rs.getInt("PRICE"));
            return book;
        }


}
