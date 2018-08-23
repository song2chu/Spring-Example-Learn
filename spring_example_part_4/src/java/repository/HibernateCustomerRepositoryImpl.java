/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Customer;

/**
 *
 * @author safev
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository{

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<Customer>();
          Customer customer = new Customer();
          customer.setFirstName("SAFE");
          customer.setLastName("Chutimasakul");
          customers.add(customer);
          return customers; 
    }
    
}
