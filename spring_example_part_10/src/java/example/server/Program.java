/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example.server;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import example.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 *
 * @author safev
 */
public class Program {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);

        BookService service = context.getBean("bookService", BookService.class);
        BookService service2 = context.getBean("bookService", BookService.class);
        BookService service3 = context.getBean("bookService", BookService.class);
        System.out.println(service);
        System.out.println(service2);
        System.out.println(service3);
    }
}
