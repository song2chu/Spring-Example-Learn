/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.server;
import example.repository.BookRepository;
import example.repository.BookRepositoryImpl;
import example.service.BookService;
import example.service.BookServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
/**
 *
 * @author safev
 */
@Configuration
@ComponentScan({"example"})
public class AppConfiguration {
    
    @Bean(name = "bookService")
    public BookService getBookService(){
        BookService service = new BookServiceImpl();
        return service;
    }
    
//    public BookRepository getBookRepository(){
//        return new BookRepositoryImpl();
//    }
}
