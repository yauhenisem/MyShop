package com.shop.myshophibernate.service;

import com.shop.myshophibernate.entity.Customer;
import com.shop.myshophibernate.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

    public Customer getUserById(long id){
        return customerRepository.getReferenceById(id);
    }

    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer update(Customer customer){
        return customerRepository.save(customer);
    }

    public void delete(long id){
        customerRepository.deleteById(id);
    }
}
