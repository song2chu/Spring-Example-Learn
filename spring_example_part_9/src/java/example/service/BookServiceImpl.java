/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.service;
import java.util.List;
import example.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import example.repository.BookRepository;
import example.repository.BookRepositoryImpl;
/**
 *
 * @author safev
 */
//@Service("bookService")
public class BookServiceImpl implements BookService{
    private BookRepository repository = new BookRepositoryImpl();
//    @Autowired
//    private BookRepository repository;
    
//    @Autowired
//    public BookServiceImpl(BookRepository repository){
//        System.out.println("Autowired By Constructor");
//        this.repository =  repository;
//    }
//    
//    public BookServiceImpl(){   
//    }
//    
//    @Autowired
//    public void setTheRepository(BookRepository repository){
//        System.out.println("Autowired By Repository");
//        this.repository = repository;
//    }
    
    @Override
    public List<Book> findAll() {
        return repository.findAll();
    }
    
}
