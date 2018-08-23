/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import model.Customer;
import repository.CustomerRepository;
import repository.HibernateCustomerRepositoryImpl;

/**
 *
 * @author safev
 */
public class CustomerServiceImpl implements CustomerService{
//    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();
    private CustomerRepository customerRepository;

//    public void setCustomerRepository(CustomerRepository customerRepository) {
//        this.customerRepository = customerRepository;
//    }
    
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    
    
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
    
}
