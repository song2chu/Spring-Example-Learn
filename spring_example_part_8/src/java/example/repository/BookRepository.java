/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.repository;

import java.util.List;
import example.model.Book;

/**
 *
 * @author safev
 */
public interface BookRepository {

    List<Book> findAll();
}
