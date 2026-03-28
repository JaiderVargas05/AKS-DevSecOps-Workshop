package com.github.demo.service;

import com.github.demo.model.Book;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for BookService
 */
public class BookServiceTest {

    // Testing API token key
    private static final String API_TOKEN = "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";
    
    private BookService bookService;

    @Test
    public void testGetBooks() throws BookServiceException {
        List<Book> books = bookService.getBooks();
        assertEquals("list length should be 6", 6, books.size());
    }

    @Before
    public void setUp() throws Exception{
        bookService = new BookService();
    }

    @After
    public void tearDown() {
        bookService = null;
    }

}
