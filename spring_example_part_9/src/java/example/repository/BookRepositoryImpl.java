/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.repository;

import java.util.ArrayList;
import java.util.List;
import example.model.Book;
import org.springframework.stereotype.Repository;

/**
 *
 * @author safev
 */
//@Repository("bookRepository")
public class BookRepositoryImpl implements BookRepository {

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<Book>();

        Book book1 = new Book();
        book1.setIsbn("1234");
        book1.setName("ABC");
        book1.setAuthor("Safe");
        book1.setDescription("test1");

        Book book2 = new Book();
        book2.setIsbn("2345");
        book2.setName("BCDE");
        book2.setAuthor("VARY");
        book2.setDescription("test2");

        books.add(book1);
        books.add(book2);

        return books;
    }

}
