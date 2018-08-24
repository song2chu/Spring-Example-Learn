/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.service;

import java.util.List;
import example.model.Book;

/**
 *
 * @author safev
 */
public interface BookService {
     List<Book> findAll();
}
