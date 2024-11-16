package com.andyalex.nathycustomer.web;

import com.andyalex.nathycustomer.entity.Customer;
import com.andyalex.nathycustomer.service.CustomerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class CustomerController {
    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("list-customers")
    public List<Customer> getCustomers() {
        List<Customer> customers = this.customerService.findAll();
        return customers;
    }

    @GetMapping("list-customers/{id}")
    public Customer getCustomer(@PathVariable Long id) {
        return this.customerService.findCustomerById(id);
    }
}
