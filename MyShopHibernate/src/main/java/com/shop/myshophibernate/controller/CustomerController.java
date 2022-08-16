package com.shop.myshophibernate.controller;

import com.shop.myshophibernate.entity.Customer;
import com.shop.myshophibernate.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Customer getById(@PathVariable long id) {
        return customerService.getUserById(id);
    }

    @PostMapping
    public Customer create(@RequestBody Customer customer) {
        return customerService.create(customer);
    }

    @PutMapping
    public Customer update(@RequestBody Customer customer) {
        return customerService.update(customer);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        customerService.delete(id);
    }

}

