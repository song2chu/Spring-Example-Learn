/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.CustomerService;
import service.CustomerServiceImpl;

/**
 *
 * @author safev
 */
public class Application {
    public static void main(String[] args) {
//        CustomerService service = new CustomerServiceImpl();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService service = context.getBean("customerService", CustomerService.class);
        
        System.out.println(service.findAll().get(0).getFirstName());
        System.out.println(service.findAll().get(0).getLastName());
    }
}
